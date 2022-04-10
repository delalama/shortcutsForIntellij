package function.git;

import Model.Key;
import Model.Shortcut;
import Model.ShortcutEntity;

import static Model.Key.CTRL;
import static Model.Key.SHIFT;

public class Push extends ShortcutEntity {

    public Push() {
        super("Push your commits", new Shortcut(CTRL, SHIFT, Key.K));
    }
}
