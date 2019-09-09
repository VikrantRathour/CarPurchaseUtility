package CarPurchase;

abstract class Car {
    protected int carID;
    protected String carModel;
    protected int carPrice;

    public Car(int carID, String carModel, int carPrice){
        this.carID = carID;
        this.carModel = carModel;
        this.carPrice = carPrice;
    }

    protected Car() {
    }

    public int getCarID(){ return carID; }
    public void setCarID(int carID){ this.carID = carID; }


    public String getCarModel(){ return carModel; }
    public void setCarModel(String carModel){ this.carModel = carModel; }

    public int getCarPrice(){ return carPrice; }
    public void setCarPrice(int carPrice){ this.carPrice = carPrice; }
}
