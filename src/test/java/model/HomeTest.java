package model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HomeTest {
    String ADRESS = "ADRESS";
    String PRICE = "PRICE";
    Home home = new Home(PRICE,ADRESS);

    @Test
    public void homeTest() {
        assertEquals(home.getAdress(), ADRESS);
        assertEquals(home.getPrice(), PRICE );
    }
}