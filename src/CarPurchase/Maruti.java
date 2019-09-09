package CarPurchase;

abstract class Maruti extends Car {

    protected Maruti(final String carModel, final int carPrice) {
        this.carModel = carModel;
        this.carPrice = carPrice;
    }
}
