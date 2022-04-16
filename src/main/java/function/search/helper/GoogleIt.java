package function.search.helper;

import Model.Shortcut;
import Model.ShortcutEntity;

import static Model.Key.ACTIONS_MENU;
import static Model.Key.GOOGLE;

public class GoogleIt extends ShortcutEntity {

    private String example = "Search on google next string";
    private String googleIt = "cooperación microbiana Lynn Margulis";

    public GoogleIt() {
        super("Search on google", new Shortcut(ACTIONS_MENU, GOOGLE));
    }

}
