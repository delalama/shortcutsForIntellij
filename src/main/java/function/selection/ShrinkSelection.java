package function.selection;

import Model.Shortcut;
import Model.ShortcutEntity;

import static Model.Key.ALT;
import static Model.Key.CTRL;
import static Model.Key.MOUSE_SELECT;
import static Model.Key.SHIFT;
import static Model.Key.W;

public class ShrinkSelection extends ShortcutEntity {

    private String example = "Shrink selection";

    public ShrinkSelection() {
        super("Extend selection", new Shortcut(CTRL, SHIFT, W));
    }

}
