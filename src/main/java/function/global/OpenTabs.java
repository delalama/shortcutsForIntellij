package function.global;

import Model.Shortcut;
import Model.ShortcutEntity;

import static Model.Key.CTRL;
import static Model.Key.E;

public class OpenTabs extends ShortcutEntity {

    public OpenTabs() {
        super("Open tabs", new Shortcut(CTRL, E));
    }
}
