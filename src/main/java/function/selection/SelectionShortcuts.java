package function.selection;

import Model.ShortcutEntity;

import java.lang.reflect.Field;

public class SelectionShortcuts {
    MouseSelection mouseSelection = new MouseSelection();
    ExtendSelection extendSelection = new ExtendSelection();
    ShrinkSelection shrinkSelection = new ShrinkSelection();

    public SelectionShortcuts() {
        printResume();
    }

    public void printResume() {
        Field[] shortcutEntities = SelectionShortcuts.class.getDeclaredFields();

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
