package CarPurchase;

abstract class Toyota extends Car {
    protected Toyota(final String carModel, final int carPrice) {
        this.carModel = carModel;
        this.carPrice = carPrice;
    }
}
