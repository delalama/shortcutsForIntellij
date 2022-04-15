package function.edition;

import Model.Shortcut;
import Model.ShortcutEntity;

import static Model.Key.CTRL;
import static Model.Key.UP_OR_DOWN_ARROWS;

public class Carets extends ShortcutEntity {

    private String example = "Split this String with multi-carets";

//    private String x = "Declare";
//    private String x1 = "x";
//    private String x2 = "Strings";
//    private String x3 = "with";
//    private String x4 = "multi";
//    private String x5 = "carets";

    public Carets() {
        super("To uppercase", new Shortcut(CTRL, CTRL, UP_OR_DOWN_ARROWS));
    }

}
