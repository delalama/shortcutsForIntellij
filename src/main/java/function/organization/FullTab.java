package function.organization;

import Model.Shortcut;
import Model.ShortcutEntity;

import static Model.Key.ALT;
import static Model.Key.ARROW;
import static Model.Key.CTRL;
import static Model.Key.ENGLISH_QUOTE;
import static Model.Key.SHIFT;

public class FullTab extends ShortcutEntity {

    public FullTab() {
        super("Full Screen tab", new Shortcut(CTRL, SHIFT, ENGLISH_QUOTE ));
    }

}
