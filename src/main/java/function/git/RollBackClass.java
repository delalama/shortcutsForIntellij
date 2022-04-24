package function.git;

import Model.Shortcut;
import Model.ShortcutEntity;

import static Model.Key.ALT;
import static Model.Key.CTRL;
import static Model.Key.Z;

public class RollBackClass extends ShortcutEntity {
    private String example = "Add changes and rollback";

    public RollBackClass() {
        super("Commit your changed files", new Shortcut(CTRL, ALT, Z));
    }
}
