package function.git;

import Model.Key;
import Model.Shortcut;
import Model.ShortcutEntity;

import static Model.Key.CTRL;

public class Commit extends ShortcutEntity {

    public Commit() {
        super("Commit your changed files", new Shortcut(CTRL, Key.K));
    }
}
