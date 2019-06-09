package Instruments;

import interfaces.IPlay;

public class Piano extends Instrument implements IPlay {
    private String pianoManufacturer;


    public Piano(String pianoManufacturer, String section, double sellingPrice, double purchasedPrice){
        super (section, sellingPrice, purchasedPrice);
        this.pianoManufacturer = pianoManufacturer;
    }

    public String getPianoManufacturer() {
        return pianoManufacturer;
    }

    public void setPianoManufacturer(String pianoManufacturer) {
        this.pianoManufacturer = pianoManufacturer;
    }

    public String makeSound(){
        return "tinkle tinkle pling";
    }
}
