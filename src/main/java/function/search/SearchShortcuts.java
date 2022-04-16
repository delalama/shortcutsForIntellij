package function.search;

import Model.ShortcutEntity;
import function.search.helper.GoogleIt;
import function.search.helper.StackOverflow;
import function.search.helper.Translate;
import function.selection.SelectionShortcuts;
import java.lang.reflect.Field;

public class SearchShortcuts {

    GoogleIt googleIt = new GoogleIt();
    StackOverflow stackOverflow = new StackOverflow();
    Translate translate = new Translate();
    SearchAll insideClass = new SearchAll();

    public SearchShortcuts() {
        printResume();
    }

    public void printResume() {
        Field[] shortcutEntities = SearchShortcuts.class.getDeclaredFields();

        System.out.println("---------------");
        System.out.println(this.getClass().getSimpleName());
        System.out.println("---------------");

        for (Field shortCut : shortcutEntities) {
            ShortcutEntity tmp = null;
            try {
                tmp = (ShortcutEntity) shortCut.get(this);
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
            tmp.printResume();
        }
    }
}
