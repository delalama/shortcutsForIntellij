package Model;

import lombok.Getter;

@Getter
public abstract class ShortcutApply {
    private final String explanation;
    private final Shortcut shortcut ;

    protected ShortcutApply(String explanation, Shortcut shortcut) {
        this.explanation = explanation;
        this.shortcut = shortcut;

        System.out.println(explanation + " -> " + getShortcut().getShortCut());
    }
}
