package function.navigation;

import Model.ShortcutEntity;
import function.navigation.acrossClass.GoToImplementation;
import function.navigation.acrossTabs.AcrossTabs;
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
    AcrossTabs acrossTabs = new AcrossTabs();
    MethodsJump methodsJump = new MethodsJump();
    LastPlaces lastPlaces = new LastPlaces();
    GoToDeclarationOrUsages goToDeclaration = new GoToDeclarationOrUsages();
    GoToImplementation goToImplementation = new GoToImplementation();
    GoTopOrBottom goTopOrBottom = new GoTopOrBottom();
    LinesJump linesJump = new LinesJump();


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
