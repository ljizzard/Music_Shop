package InstrumentTests;

import Instruments.Saxophone;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SaxophoneTest {

    private Saxophone saxophone;

    @Before

    public void setUp(){
        saxophone = new Saxophone("Alto", "Woodwind",2000,1500);
    }

    @Test
    public void getSaxophoneType() {
        assertEquals("Alto", saxophone.getSaxophoneType());
    }

    @Test
    public void canMakeSound(){
        assertEquals("Doo doo doo", saxophone.makeSound());
    }

    @Test
    public void canGetSellingPrice() {
        assertEquals(2000, saxophone.getSellingPrice(), 0.00);
    }

    @Test
    public void canSetSellingPrice() {
        saxophone.setSellingPrice(2000);
        assertEquals(2000, saxophone.getSellingPrice(), 0.00);
    }

    @Test
    public void canGetPurchasedPrice() {
        assertEquals(1500, saxophone.getPurchasedPrice(), 0.00);
    }

    @Test
    public void canSetPurchasedPrice() {
        saxophone.setPurchasedPrice(350);
        assertEquals(350, saxophone.getPurchasedPrice(), 0.00);


    }
    @Test
    public void canCalculateMarkup(){
        assertEquals(500, saxophone.calculateMarkup(), 0.00);
    }


}