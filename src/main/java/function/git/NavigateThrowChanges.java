package function.git;

import Model.Shortcut;
import Model.ShortcutEntity;

import static Model.Key.ALT;
import static Model.Key.CTRL;
import static Model.Key.SHIFT;
import static Model.Key.UP_OR_DOWN_ARROWS;
import static Model.Key.Z;

public class NavigateThrowChanges extends ShortcutEntity {
    private String example = "Add changes and navigate throw them";

    public NavigateThrowChanges() {
        super("Commit your changed files", new Shortcut(CTRL, SHIFT, ALT, UP_OR_DOWN_ARROWS));
    }
}
