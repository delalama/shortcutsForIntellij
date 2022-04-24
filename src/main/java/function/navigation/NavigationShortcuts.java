package function.navigation;

import Model.ShortcutEntity;
import function.navigation.acrossClass.GoToImplementation;
import function.navigation.acrossTabs.AcrossTabs;
import function.navigation.bookmarks.AddBookmark;
import function.navigation.bookmarks.BookmarksMenu;
import function.navigation.insideClass.GoToDeclarationOrUsages;
import function.navigation.insideClass.GoTopOrBottom;
import function.documentation.MethodsInfo;
import function.navigation.insideClass.MethodsJump;
import function.navigation.insideCode.LinesJump;
import function.navigation.lastPlaces.LastPlaces;
import lombok.AllArgsConstructor;

import java.lang.reflect.Field;

@AllArgsConstructor
public class NavigationShortcuts {
    GoToImplementation goToImplementation = new GoToImplementation();
    AcrossTabs acrossTabs = new AcrossTabs();

    //    bookmarks
    AddBookmark addBookmark = new AddBookmark();
    BookmarksMenu bookmarksMenu = new BookmarksMenu();

    //    inside class
    GoToDeclarationOrUsages goToDeclaration = new GoToDeclarationOrUsages();
    GoTopOrBottom goTopOrBottom = new GoTopOrBottom();
    MethodsJump methodsJump = new MethodsJump();

    LinesJump linesJump = new LinesJump();
    LastPlaces lastPlaces = new LastPlaces();

    public NavigationShortcuts() {
        printResume();
    }

    public void printResume() {
        Field[] shortcutEntities = this.getClass().getDeclaredFields();

        System.out.println("---------------");
        System.out.println(this.getClass().getSimpleName());
        System.out.println("---------------");
        for (Field shortCut : shortcutEntities) {
            ShortcutEntity tmp = null;
            try {
                tmp = (ShortcutEntity) shortCut.get(this);
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
            tmp.printResume();
        }

    }

}
