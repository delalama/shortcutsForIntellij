package function.navigation.insideClass;

import Model.Shortcut;
import Model.ShortcutEntity;

import static Model.Key.CTRL;
import static Model.Key.INIT_OR_END;

public class GoTopOrBottom extends ShortcutEntity {

    public GoTopOrBottom() {
        super("Go top or bottom", new Shortcut(CTRL , INIT_OR_END));
    }

}
