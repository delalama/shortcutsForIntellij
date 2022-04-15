package function.navigation.acrossClass;

import Model.Shortcut;
import Model.ShortcutEntity;
import function.navigation.acrossClass.impl.whateverInterface;

import static Model.Key.ALT;
import static Model.Key.B;
import static Model.Key.CTRL;

public class GoToImplementation extends ShortcutEntity implements whateverInterface {
    private String example = "Go to interface and search from there the implementation";

    public GoToImplementation() {
        super("Go to declaration or usages", new Shortcut(CTRL , ALT , B));
    }

    @Override public void whateverMethode() {

    }
}
