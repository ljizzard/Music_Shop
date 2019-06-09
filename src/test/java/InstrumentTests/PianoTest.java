package InstrumentTests;



import Instruments.Piano;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class PianoTest {

    private Piano piano;

    @Before

    public void setUp(){
        piano = new Piano("Bosendorfer", "String",2000,1500);

    }

    @Test
    public void canGetSection(){
        assertEquals("String", piano.getSection());
    }

    @Test
    public void canGetPianoManufacturer(){
        assertEquals("Bosendorfer", piano.getPianoManufacturer());
    }

    @Test
    public void canMakeSound(){
        assertEquals("tinkle tinkle pling", piano.makeSound());
    }

    @Test
    public void canGetSellingPrice() {
        assertEquals(2000, piano.getSellingPrice(), 0.00);
    }

    @Test
    public void canSetSellingPrice() {
        piano.setSellingPrice(2000);
        assertEquals(2000, piano.getSellingPrice(), 0.00);
    }

    @Test
    public void canGetPurchasedPrice() {
        assertEquals(1500, piano.getPurchasedPrice(), 0.00);
    }

    @Test
    public void canSetPurchasedPrice() {
        piano.setPurchasedPrice(350);
        assertEquals(350, piano.getPurchasedPrice(), 0.00);


    }
    @Test
    public void canCalculateMarkup(){
        assertEquals(500, piano.calculateMarkup(), 0.00);
    }
}