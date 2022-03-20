package model;

public class Home {
    private String price;
    private String adress;

    public Home(String price, String adress) {
        this.price = price;
        this.adress = adress;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    @Override public String toString() {
        return "House price is " + price + " and house adress is " + adress ;
    }
}
