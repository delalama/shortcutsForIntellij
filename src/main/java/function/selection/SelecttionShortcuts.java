package function.selection;

import Model.ShortcutEntity;
import function.Edition.Carets;
import function.Edition.UpperCase;

import java.lang.reflect.Field;

public class SelecttionShortcuts {
    MouseSelection mouseSelection = new MouseSelection();

    public SelecttionShortcuts() {
        printResume();
    }

    public void printResume() {
        Field[] shortcutEntities = SelecttionShortcuts.class.getDeclaredFields();

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
