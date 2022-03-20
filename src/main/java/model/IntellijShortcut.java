package model;

public class IntellijShortcut {
    private String name ;
    private String shortcut ;
    private String description ;

    public IntellijShortcut() {
    }

    /**
     * This method prints the shortcut description
     */
    public void printDescription() {
        System.out.println(description);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getShortcut() {
        return shortcut;
    }

    public void setShortcut(String shortcut) {
         this.shortcut = shortcut;
    }
}
