package Model;

import lombok.Getter;

@Getter
public abstract class ShortcutEntity {
    private final String explanation;
    private final Shortcut shortcut ;

    protected ShortcutEntity(String explanation, Shortcut shortcut) {
        this.explanation = explanation;
        this.shortcut = shortcut;
    }

    public void printResume() {
        System.out.println("  " + explanation + " -> " + getShortcut().getShortCut());
    }
}
