package function.global;

import Model.Shortcut;
import Model.ShortcutEntity;

import static Model.Key.CTRL;
import static Model.Key.TAB;

public class Switcher extends ShortcutEntity {

    public Switcher() {
        super("Switcher menu", new Shortcut(CTRL, TAB));
    }
}
