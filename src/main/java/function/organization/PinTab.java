package function.organization;

import Model.Key;
import Model.Shortcut;
import Model.ShortcutEntity;

import static Model.Key.ACTIONS_MENU;
import static Model.Key.PIN;

public class PinTab extends ShortcutEntity {

    private String example = "Configure -> Show pinned tabs in a separate row";

    public PinTab() {
        super("Pin tab", new Shortcut(ACTIONS_MENU , PIN));
    }

}
