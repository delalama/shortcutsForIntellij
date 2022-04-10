package function.git;

import Model.Key;
import Model.Shortcut;
import Model.ShortcutApply;

import static Model.Key.CTRL;

public class commit extends ShortcutApply {

    public commit() {
        super("Commit your changed files", new Shortcut(CTRL, Key.K));
    }
}
