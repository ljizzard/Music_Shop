package Instruments;

import interfaces.ISell;

public abstract class Instrument implements ISell {

    private String section;
    private double sellingPrice;
    private double purchasedPrice;


    public Instrument(String section, double sellingPrice, double purchasedPrice){
        this.section = section;
        this.sellingPrice = sellingPrice;
        this.purchasedPrice = purchasedPrice;
    }


    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public double getPurchasedPrice() {
        return purchasedPrice;
    }

    public double getSellingPrice() {
        return sellingPrice;
    }

    public void setPurchasedPrice(double purchasedPrice) {
        this.purchasedPrice = purchasedPrice;
    }

    public void setSellingPrice(double sellingPrice) {
        this.sellingPrice = sellingPrice;
    }

    public double calculateMarkup() {
        return this.sellingPrice - this.purchasedPrice;
    }
}
