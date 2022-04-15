package function.selection;

import Model.Shortcut;
import Model.ShortcutEntity;

import static Model.Key.ALT;
import static Model.Key.MOUSE_SELECT;

public class MouseSelection extends ShortcutEntity {

    private String example0 = "Declare";
    private String example1 = "this";
    private String example2 = "String";
    private String example3 = "in";
    private String example4 = "one";
    private String example5 = "line";
    
    private String splitLine = "";


    public MouseSelection() {
        super("To uppercase", new Shortcut(ALT, MOUSE_SELECT));
    }

}
