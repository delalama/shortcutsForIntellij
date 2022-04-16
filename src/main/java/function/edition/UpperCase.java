package function.edition;

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

    String linesToPracticeJump = "lorem ipsum is simply dummy text of the printing and typesetting industry. lorem ipsum has been the industry's standard dummy text "
            + "ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. it has survived not only five "
            + "centuries, but also the leap into electronic typesetting, remaining essentially unchanged. it was popularised in the 1960s with the release of letraset "
            + "sheets containing lorem ipsum passages, and more recently with desktop publishing software like aldus pagemaker including versions of lorem ipsum.";

}
