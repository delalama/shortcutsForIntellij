package function.search.helper;

import Model.Shortcut;
import Model.ShortcutEntity;

import static Model.Key.ACTIONS_MENU;
import static Model.Key.GOOGLE;

public class GoogleIt extends ShortcutEntity {

    private String example = "Search on google next string";
    private String googleIt = "Spring Kafka streams baeldung";

    public GoogleIt() {
        super("Search on google", new Shortcut(ACTIONS_MENU, GOOGLE));
    }

}
