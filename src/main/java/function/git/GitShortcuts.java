package function.git;

import Model.ShortcutEntity;
import function.navigation.NavigationShortcuts;

import java.lang.reflect.Field;

public class GitShortcuts {
    Commit commit = new Commit();
    Push commitAndPush = new Push();
    RollBackClass rollBackClass = new RollBackClass();
    NavigateThrowChanges navigateThrowChanges = new NavigateThrowChanges();

    public GitShortcuts() {
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
