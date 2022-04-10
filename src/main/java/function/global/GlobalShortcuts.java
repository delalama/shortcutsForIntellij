package function.global;

import Model.ShortcutEntity;
import function.navigation.NavigationShortcuts;

import java.lang.reflect.Field;

public class GlobalShortcuts {
    ActionsMenu actionsMenu = new ActionsMenu();
    Switcher switcher = new Switcher();

    public GlobalShortcuts() {
        printResume();
    }

    public void printResume() {
        Field[] shortcutEntities = GlobalShortcuts.class.getDeclaredFields();

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
