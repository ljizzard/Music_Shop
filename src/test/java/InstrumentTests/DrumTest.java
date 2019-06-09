package InstrumentTests;


import Instruments.Drum;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DrumTest {

    private Drum drum;

    @Before

    public void setUp() {
        drum = new Drum("Snare", "percussion",2000,1500);

    }

    @Test
    public void canGetSection() {
        assertEquals("percussion", drum.getSection());
    }

    @Test
    public void canGetTypeOfDrum() {
        assertEquals("Snare", drum.getTypeOfDrum());
    }

    @Test
    public void canMakeSound() {
        assertEquals("Boom boom", drum.makeSound());
    }

    @Test
    public void canGetSellingPrice() {
        assertEquals(1500, drum.getSellingPrice(), 0.00);
    }

    @Test
    public void canSetSellingPrice() {
        drum.setSellingPrice(2000);
        assertEquals(2000, drum.getSellingPrice(), 0.00);
    }

    @Test
    public void canGetPurchasedPrice() {
        assertEquals(850, drum.getPurchasedPrice(), 0.00);
    }

    @Test
    public void canSetPurchasedPrice() {
        drum.setPurchasedPrice(350);
        assertEquals(350, drum.getPurchasedPrice(), 0.00);


    }
    @Test
    public void canCalculateMarkup(){
        assertEquals(650, drum.calculateMarkup(), 0.00);
    }
}
