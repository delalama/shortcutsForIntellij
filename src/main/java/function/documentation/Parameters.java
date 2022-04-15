package function.documentation;

import Model.Shortcut;
import Model.ShortcutEntity;

import static Model.Key.CTRL;
import static Model.Key.P;

public class Parameters extends ShortcutEntity {
    private String example = "Use whatever() on printWhatever() and ask for parameters";

    public Parameters() {
        super("Class parameters", new Shortcut(CTRL , P));
    }

    private void whatever(String param1, String param2) {
        System.out.println(param1 + param2);
    }

    private void printWhatever(){
//        whatever();
    }
}
