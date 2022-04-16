package function.search.helper;

import Model.Shortcut;
import Model.ShortcutEntity;

import static Model.Key.ACTIONS_MENU;
import static Model.Key.GOOGLE;
import static Model.Key.STACK_OVERFLOW;

public class StackOverflow extends ShortcutEntity {

    private String example = "Install plugin 'Search with StackOverflow' and use it";
    private String example1 = "Java regular expressions";

    public StackOverflow() {
        super("Search on stack overflow", new Shortcut(ACTIONS_MENU, STACK_OVERFLOW));
    }

}
