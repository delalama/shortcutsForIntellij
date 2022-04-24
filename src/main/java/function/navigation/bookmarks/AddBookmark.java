package function.navigation.bookmarks;

import Model.Shortcut;
import Model.ShortcutEntity;
import static Model.Key.CTRL;
import static Model.Key.NUMBER_1_TO_9;
import static Model.Key.SHIFT;

public class AddBookmark extends ShortcutEntity {

    private String example = "Add some bookmarks on dumb classes and navigate throw them";

    public AddBookmark() {
        super("Add bookmark", new Shortcut(CTRL, SHIFT, NUMBER_1_TO_9));
    }

}
