package function.documentation;

import Model.ShortcutEntity;
import java.lang.reflect.Field;

public class DocumentationShortcuts {

    MethodsInfo methodsInfo = new MethodsInfo();
    Diagram diagram = new Diagram();
    Parameters parameters = new Parameters();

    public DocumentationShortcuts() {
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
