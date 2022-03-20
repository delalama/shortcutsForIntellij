package model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NinjaShortcutTest {

    @Test
    public void testNinja(){
        String NAME = "NAME";
        String SHORTCUT = "SHORTCUT";

        IntellijShortcut ninjaShortcut = new IntellijShortcut();
        ninjaShortcut.setName(NAME);
        ninjaShortcut.setShortcut(SHORTCUT);
        ninjaShortcut.printDescription();

        assertEquals(ninjaShortcut.getName(), NAME);
    }

}