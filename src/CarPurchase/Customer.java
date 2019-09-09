package CarPurchase;


import java.util.ArrayList;

public class Customer {
    private int ID;
    private String name;
    ArrayList<Car> cars = new ArrayList<>();


    public Customer(int ID, String name) {
        this.ID = ID;
        this.name = name;
    }

    public int getID() {
        return ID;
    }
    public void setID(int ID) {
        this.ID = ID;
    }


    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public ArrayList getCars() {
        return cars;
    }
//    public void setCars(ArrayList cars) {
//        this.cars = cars;
//    }

}
