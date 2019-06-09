package Instruments;

public abstract class Instrument {

    private String section;


    public Instrument(String section){
        this.section = section;
    }


    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }


}
