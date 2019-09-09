package CarPurchase;

abstract class Toyota extends Car {
    public Toyota(int carID, String carType, String carModel, int carPrice) {
        this.carID = carID;
        this.carModel = carModel;
        this.carPrice = carPrice;
    }
}
