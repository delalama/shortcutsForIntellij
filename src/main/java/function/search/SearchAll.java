package function.search;

import Model.Shortcut;
import Model.ShortcutEntity;

import static Model.Key.CTRL;
import static Model.Key.N;
import static Model.Key.SHIFT;

public class SearchAll extends ShortcutEntity {

    private String db = "palabras";
    private String classSearch = "PinTab";
    private String fileSearch = "Readme.md";

    public SearchAll() {
        super("Search all", new Shortcut(SHIFT, SHIFT));
    }
    public SearchAll(String dumbParam) {
        super("Search for classes", new Shortcut(CTRL, N));
    }
    public SearchAll(String dumbParam, String dumbParam2) {
        super("Search for files", new Shortcut(CTRL, SHIFT, N));
    }

}
