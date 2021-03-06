package function.navigation.acrossTabs;

import Model.Key;
import Model.Shortcut;
import Model.ShortcutEntity;

public class AcrossTabs extends ShortcutEntity {

    private DumbClass0 dumbClass0;
    private DumbClass1 dumbClass1;
    private DumbClass2 dumbClass2;

    public AcrossTabs() {
        super("Jump across tabs", new Shortcut(Key.ALT, Key.LEFT_OR_RIGHT_ARROWS));
    }
}
