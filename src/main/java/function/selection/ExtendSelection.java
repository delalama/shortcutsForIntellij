package function.selection;

import Model.Shortcut;
import Model.ShortcutEntity;

import static Model.Key.CTRL;
import static Model.Key.W;

public class ExtendSelection extends ShortcutEntity {
    private String example = "Go to :21 params, extend and explain";

    public ExtendSelection() {
        super("Extend selection", new Shortcut(CTRL, W));
    }

    public void extendMethod(String example0, String example1) {
        String whatever = "";
        String whatever1 = "";

        StringBuilder stringBuilder =
                new StringBuilder(whatever + whatever1);
    }
}
