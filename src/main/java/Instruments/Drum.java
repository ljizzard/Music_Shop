package Instruments;


import interfaces.IPlay;

public class Drum extends Instrument implements IPlay {
    private String typeOfDrum;



    public Drum (String typeOfDrum, String section){
        super (section);
        this.typeOfDrum = typeOfDrum;
    }

    public String getTypeOfDrum() {
        return typeOfDrum;
    }

    public void setTypeOfDrum(String typeOfDrum) {
        this.typeOfDrum = typeOfDrum;
    }

    public String makeSound(){
        return "Boom boom";
    }
}
