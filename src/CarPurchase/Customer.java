package CarPurchase;


public class Customer {

    private String name;
    private int ID;
    private String carName;
    private int carPrice;

    public Customer(String name, int ID, String carName, int carPrice) {
        this.name = name;
        this.ID = ID;
        this.carName = carName;
        this.carPrice = carPrice;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getCarName(){ return carName; }

    public void setCarName(String carName){ this.carName = carName; }

    public int getCarPrice(){ return carPrice; }

    public void setCarPrice(int carPrice){ this.carPrice = carPrice; }
}
