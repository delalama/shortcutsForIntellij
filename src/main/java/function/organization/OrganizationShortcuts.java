package function.organization;

import Model.ShortcutEntity;

import java.lang.reflect.Field;

public class OrganizationShortcuts {
    CleanScreen cleanScreen = new CleanScreen();
    ResizeTab resizeTab = new ResizeTab();
    FullTab fullTab = new FullTab();
    PinTab pintab = new PinTab();

    public OrganizationShortcuts() {
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
