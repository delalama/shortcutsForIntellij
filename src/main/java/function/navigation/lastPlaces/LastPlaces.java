package function.navigation.lastPlaces;

import Model.Key;
import Model.Shortcut;
import Model.ShortcutApply;

public class LastPlaces extends ShortcutApply {

    public LastPlaces() {
        super("Navigate to backward || forward", new Shortcut(Key.CTRL, Key.ALT, Key.LEFT_OR_RIGHT_ARROWS) );
    }

}
