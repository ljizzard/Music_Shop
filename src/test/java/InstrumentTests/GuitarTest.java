package InstrumentTests;

import Instruments.Guitar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    private Guitar guitar;

    @Before

    public void setUp() {
        guitar = new Guitar(6, "String",2000,1500);

    }

    @Test
    public void canGetSection() {
        assertEquals("String", guitar.getSection());
    }

    @Test
    public void canGetNumberOfStrings() {
        assertEquals(6, guitar.getNumberOfStrings());
    }

    @Test
    public void canMakeSound() {
        assertEquals("strum strum twang", guitar.makeSound());
    }
    @Test
    public void canGetSellingPrice() {
        assertEquals(1500, guitar.getSellingPrice(), 0.00);
    }

    @Test
    public void canSetSellingPrice() {
        guitar.setSellingPrice(2000);
        assertEquals(2000, guitar.getSellingPrice(), 0.00);
    }

    @Test
    public void canGetPurchasedPrice() {
        assertEquals(850, guitar.getPurchasedPrice(), 0.00);
    }

    @Test
    public void canSetPurchasedPrice() {
        guitar.setPurchasedPrice(350);
        assertEquals(350, guitar.getPurchasedPrice(), 0.00);


    }
    @Test
    public void canCalculateMarkup(){
        assertEquals(650, guitar.calculateMarkup(), 0.00);
    }
}

