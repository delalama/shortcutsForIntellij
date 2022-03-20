import model.Adress;
import model.House;

public class ninjaShortcutsMain {

    public static void main(String[] args) {

        Adress addr = new Adress("StreetName", "10");

        House house = new House("1.4", addr);

        System.out.println(house);

    }
}
