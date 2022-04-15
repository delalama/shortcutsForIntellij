package function.documentation;

import Model.Shortcut;
import Model.ShortcutEntity;

import static Model.Key.ALT;
import static Model.Key.CTRL;
import static Model.Key.I;
import static Model.Key.P;
import static Model.Key.Q;
import static Model.Key.SHIFT;
import static Model.Key.U;

public class Diagram extends ShortcutEntity {

    public Diagram() {
        super("Class diagram", new Shortcut(CTRL , ALT, SHIFT, U));
    }

}
