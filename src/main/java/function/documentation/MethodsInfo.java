package function.documentation;

import Model.Shortcut;
import Model.ShortcutEntity;

import static Model.Key.CTRL;
import static Model.Key.I;
import static Model.Key.P;
import static Model.Key.Q;
import static Model.Key.SHIFT;

public class MethodsInfo extends ShortcutEntity {
    private String example = "Go to method1 usage and get method1 info";

    public MethodsInfo() {
        super("Methods info", new Shortcut(CTRL , Q));
    }

    public MethodsInfo(String alternate) {
        super("Documentation resume", new Shortcut(CTRL , SHIFT, P));
    }

    public MethodsInfo(String alternate, String alternate2) {
        super("Documentation resume", new Shortcut(CTRL , SHIFT, I));
    }

    public String method0() {
        String string = method1();
        return null;
    }

    public String method1() {
        String thisIsALineCodeThatYoullFindOnExtendedDocumentationShortcut = "";
        return thisIsALineCodeThatYoullFindOnExtendedDocumentationShortcut;
    }

}
