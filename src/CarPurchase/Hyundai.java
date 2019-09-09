package CarPurchase;

abstract class Hyundai extends Car {
    protected Hyundai(final String carModel, final int carPrice) {
        this.carModel = carModel;
        this.carPrice = carPrice;
    }
}