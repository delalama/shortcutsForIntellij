package function.search.helper;

import Model.Shortcut;
import Model.ShortcutEntity;

import static Model.Key.ACTIONS_MENU;
import static Model.Key.STACK_OVERFLOW;
import static Model.Key.TRANSLATE;

public class Translate extends ShortcutEntity {

    private String example = "Install plugin 'Translation plugin' and use it";
    private String example1 = "Omschrijving";

    public Translate() {
        super("Search on stack overflow", new Shortcut(ACTIONS_MENU, TRANSLATE));
    }

}
