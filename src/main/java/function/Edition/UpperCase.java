package function.Edition;

import Model.Shortcut;
import Model.ShortcutEntity;

import static Model.Key.CTRL;
import static Model.Key.SHIFT;
import static Model.Key.U;

public class UpperCase extends ShortcutEntity {
    private String example = "Uppercase text";

    public UpperCase() {
        super("To uppercase", new Shortcut(CTRL, SHIFT, U));
    }

    String linesToPracticeJump = "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text "
            + "ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five "
            + "centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset "
            + "sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.";

}
