package function.global;

import Model.Shortcut;
import Model.ShortcutEntity;

import static Model.Key.A;
import static Model.Key.CTRL;
import static Model.Key.SHIFT;

public class ActionsMenu extends ShortcutEntity {
    private String example = "Pin tabs || git blame";

    public ActionsMenu() {
        super("Actions menu", new Shortcut(CTRL, SHIFT, A));
    }
}
