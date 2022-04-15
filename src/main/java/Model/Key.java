package Model;

public enum Key{
    TAB("TAB"),
    ALT("ALT"),
    CTRL("CTRL"),
    SHIFT("SHIFT"),
    SPACE("SPACE"),
    A("A"),
    B("B"),
    C("C"),
    D("D"),
    E("E"),
    F("F"),
    G("G"),
    H("H"),
    I("I"),
    J("J"),
    K("K"),
    L("L"),
    M("M"),
    N("N"),
    O("O"),
    P("P"),
    Q("Q"),
    R("R"),
    S("S"),
    T("T"),
    U("U"),
    V("V"),
    W("W"),
    X("X"),
    Y("Y"),
    Z("Z"),
    ONE("1"),
    TWO("2"),
    THREE("3"),
    FOUR("4"),
    FIVE("5"),
    SIX("6"),
    SEVEN("7"),
    EIGHT("8"),
    NINE("9"),
    ZERO("0"),
    F1("F1"),
    F2("F2"),
    F3("F3"),
    F4("F4"),
    F5("F5"),
    F6("F6"),
    F7("F7"),
    F8("F8"),
    F9("F9"),
    F10("F10"),
    F11("F11"),
    F12("F12"),
    INSERT("INSERT"),
    SUPR("SUPR"),
    INIT("INIT"),
    END("END"),
    REPAG("REPAG"),
    AVPAG("AVPAG"),
    UP("↑"),
    DOWN("↓"),
    LEFT("←"),
    RIGHT("→"),
    SLASH("/"),
    ENGLISH_QUOTE("'"),
    LEFT_OR_RIGHT_ARROWS("(← || →)"),
    UP_OR_DOWN_ARROWS("(↑ || ↓)"),
    INIT_OR_END("(INIT || END)"),
    MOUSE_SELECT ("MOUSE SELECT")
    ;

    final String value;

    Key(String val) {
        this.value = val;
    }

    public String getValue() {
        return value;
    }
}
