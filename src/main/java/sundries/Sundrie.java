package sundries;

import interfaces.ISell;

public abstract class Sundrie implements ISell {

    private String name;
    private double sellingPrice;
    private double purchasedPrice;

    public Sundrie(String name, double sellingPrice, double purchasedPrice) {
        this.name = name;
        this.sellingPrice = sellingPrice;
        this.purchasedPrice = purchasedPrice;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSellingPrice(double sellingPrice) {
        this.sellingPrice = sellingPrice;
    }

    public double getSellingPrice() {
        return sellingPrice;
    }

    public void setPurchasedPrice(double purchasedPrice) {
        this.purchasedPrice = purchasedPrice;
    }

    public double getPurchasedPrice() {
        return purchasedPrice;
    }

    public double calculateMarkup() {
        return sellingPrice - purchasedPrice;
    }

}
