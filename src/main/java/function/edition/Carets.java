package function.edition;

import Model.Shortcut;
import Model.ShortcutEntity;

import static Model.Key.CTRL;
import static Model.Key.UP_OR_DOWN_ARROWS;

public class Carets extends ShortcutEntity {

    private String example = "Split this String with multi carets";

    public Carets() {
        super("To uppercase", new Shortcut(CTRL, CTRL, UP_OR_DOWN_ARROWS));
    }

}
