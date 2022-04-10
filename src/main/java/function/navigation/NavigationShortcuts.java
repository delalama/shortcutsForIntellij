package function.navigation;

import Model.ShortcutEntity;
import function.navigation.acrossTabs.AcrossTabs;
import function.navigation.insideClass.GoTopOrBottom;
import function.navigation.insideClass.MethodsJump;
import function.navigation.insideCode.LinesJump;
import function.navigation.lastPlaces.LastPlaces;
import lombok.AllArgsConstructor;

import java.lang.reflect.Field;

@AllArgsConstructor
public class NavigationShortcuts {
    AcrossTabs acrossTabs = new AcrossTabs();
    MethodsJump methodsJump = new MethodsJump();
    GoTopOrBottom goTopOrBottom = new GoTopOrBottom();
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
