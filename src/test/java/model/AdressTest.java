package model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AdressTest {

    String HOUSENUM = "HouseNum";
    String STREETNAME = "StreetName";

    Adress adress =new Adress(STREETNAME, HOUSENUM );

    @Test
    public void adressTest() {
        assertEquals( adress.getStreetName(), STREETNAME);
        assertEquals( adress.getHouseNumber(), HOUSENUM);
    }

}