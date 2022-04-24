package function.navigation.bookmarks;

public class DumbDao {
    String whatever;
    String whatever2;

    public DumbDao(String whatever, String whatever2) {
        this.whatever = whatever;
        this.whatever2 = whatever2;
    }


    public String fetchWhatever() {
        return whatever;
    }
}
