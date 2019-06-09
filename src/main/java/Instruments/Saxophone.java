package Instruments;

import interfaces.IPlay;

public class Saxophone extends Instrument implements IPlay {
    private String saxophoneType;

    public Saxophone ( String saxophoneType, String section, double sellingPrice, double purchasedPrice){
        super(section, sellingPrice, purchasedPrice);
        this.saxophoneType = saxophoneType;
    }

    public String getSaxophoneType() {
        return saxophoneType;
    }

    public String makeSound() {
        return "Doo doo doo";
    }

}
