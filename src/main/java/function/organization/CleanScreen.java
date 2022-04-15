package function.organization;

import Model.Shortcut;
import Model.ShortcutEntity;

import static Model.Key.CTRL;
import static Model.Key.F12;
import static Model.Key.SHIFT;

public class CleanScreen extends ShortcutEntity {

    private String example = "Open 2-3 windows and clean";

    public CleanScreen() {
        super("Clean Screen", new Shortcut(CTRL, SHIFT, F12));
    }

}
