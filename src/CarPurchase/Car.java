package CarPurchase;

abstract class Car {
    protected String carModel;
    protected int carPrice;

    public Car(String carModel, int carPrice){
        this.carModel = carModel;
        this.carPrice = carPrice;
    }




    public String getCarModel(){ return carModel; }
    public void setCarModel(String carModel){ this.carModel = carModel; }

    public int getCarPrice(){ return carPrice; }
    public void setCarPrice(int carPrice){ this.carPrice = carPrice; }
}
