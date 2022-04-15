package function.Edition;

import Model.ShortcutEntity;

import java.lang.reflect.Field;

public class EditionShortcuts {
    UpperCase upperCase = new UpperCase();
    Carets carets = new Carets();

    public EditionShortcuts() {
        printResume();
    }

    public void printResume() {
        Field[] shortcutEntities = EditionShortcuts.class.getDeclaredFields();

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
