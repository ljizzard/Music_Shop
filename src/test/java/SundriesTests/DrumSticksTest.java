package SundriesTests;

import org.junit.Before;
import org.junit.Test;
import sundries.Drumsticks;

import static org.junit.Assert.assertEquals;

public class DrumSticksTest {

    private Drumsticks drumsticks;

    @Before
    public void setUp(){
        drumsticks = new Drumsticks("Brush", 15, 7);
    }

    @Test
    public void canSetName() {
        drumsticks.setName("Basic");
        assertEquals("Basic", drumsticks.getName());
    }

    @Test

    public void canGetName() {
        assertEquals("Brush", drumsticks.getName());
    }

    @Test
    public void canSetSellingPrice(){
        drumsticks.setSellingPrice(15);
        assertEquals(15, drumsticks.getSellingPrice(), 0.00);
    }

    @Test
    public void canGetPurchasedPrice(){
        assertEquals(5, drumsticks.getPurchasedPrice(), 0.00);
    }

    @Test
    public void canSetPurchasedPrice(){
        drumsticks.setPurchasedPrice(10);
        assertEquals(10, drumsticks.getPurchasedPrice(), 0.00);
    }

    @Test
    public void canGetCalculateMarkup(){
        assertEquals(7, drumsticks.calculateMarkup(), 0.00);
    }


}

