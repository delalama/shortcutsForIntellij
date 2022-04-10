package function.navigation.lastPlaces;

import Model.Key;
import Model.Shortcut;
import Model.ShortcutEntity;

public class LastPlaces extends ShortcutEntity {

    public LastPlaces() {
        super("Navigate to backward || forward", new Shortcut(Key.CTRL, Key.ALT, Key.LEFT_OR_RIGHT_ARROWS) );
    }

}
