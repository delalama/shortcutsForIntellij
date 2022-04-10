package Model;

import java.lang.reflect.Field;

public class Tools {

    public void printResume(Object obj) {
        Field[] shortcutEntities = obj.getClass().getDeclaredFields();

        for (Field shortCut : shortcutEntities) {
            if (ShortcutEntity.class.isAssignableFrom(shortCut.getType())) {
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

}
