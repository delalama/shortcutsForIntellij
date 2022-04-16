package function.search;

import Model.Shortcut;
import Model.ShortcutEntity;

import static Model.Key.SHIFT;

public class SearchAll extends ShortcutEntity {

    private String db = "palabras";
    private String classSearch = "PinTab";
    private String fileSearch = "Readme.md";

    public SearchAll() {
        super("Search inside class", new Shortcut(SHIFT, SHIFT));
    }

}
