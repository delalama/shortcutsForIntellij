package function.organization;

import Model.Shortcut;
import Model.ShortcutEntity;

import static Model.Key.ALT;
import static Model.Key.ARROW;
import static Model.Key.CTRL;
import static Model.Key.F12;
import static Model.Key.SHIFT;
import static Model.Key.UP_OR_DOWN_ARROWS;

public class ResizeTab extends ShortcutEntity {

    public ResizeTab() {
        super("Resize tab", new Shortcut(CTRL, ALT, SHIFT, ARROW));
    }

}
