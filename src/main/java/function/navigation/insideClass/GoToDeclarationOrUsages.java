package function.navigation.insideClass;

import Model.Shortcut;
import Model.ShortcutEntity;

import static Model.Key.B;
import static Model.Key.CTRL;

public class GoToDeclarationOrUsages extends ShortcutEntity {
    private String example = "example";

    public GoToDeclarationOrUsages() {
        super("Go to declaration or usages", new Shortcut(CTRL , B));
    }

    public String getExample() {
        return example;
    }


}
