package Instruments;

import interfaces.IPlay;

public class Guitar extends Instrument implements IPlay {
    private int numberOfStrings;


    public Guitar (int numberOfStrings, String section, double sellingPrice, double purchasedPrice){
        super (section, sellingPrice, purchasedPrice);
        this.numberOfStrings = numberOfStrings;
    }

    public int getNumberOfStrings() {
        return numberOfStrings;
    }

    public void setNumberOfStrings(int numberOfStrings) {
        this.numberOfStrings = numberOfStrings;
    }

    public String makeSound(){
        return "Strum strum twang";
    }
}







