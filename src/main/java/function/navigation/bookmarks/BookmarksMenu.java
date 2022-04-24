package function.navigation.bookmarks;

import Model.Shortcut;
import Model.ShortcutEntity;

import static Model.Key.ALT;
import static Model.Key.CTRL;
import static Model.Key.F11;
import static Model.Key.NUMBER_1_TO_9;
import static Model.Key.SHIFT;
import static Model.Key.TWO;

public class BookmarksMenu extends ShortcutEntity {

    private String example = "Open bookmarks menu and go to bookmarks menu";

    public BookmarksMenu() {
        super("Bookmarks menu", new Shortcut(ALT, TWO));
    }
    public BookmarksMenu(String dumbParam) {
        super("Go to bookmarks menu", new Shortcut(F11, CTRL, SHIFT));
    }

}
