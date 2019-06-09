package SundriesTests;

import org.junit.Before;
import org.junit.Test;
import sundries.GuitarAccessories;
import sundries.Sundrie;

import static org.junit.Assert.assertEquals;

public class GuitarAccessoriesTest{

        private GuitarAccessories guitarAccessories;

        @Before
        public void setUp(){
            guitarAccessories = new GuitarAccessories("Nylon", 15, 7);
        }

        @Test
        public void canSetName() {
            guitarAccessories.setName("Steel");
            assertEquals("Steel", guitarAccessories.getName());
        }

        @Test

        public void canGetName() {
            assertEquals("Nylon", guitarAccessories.getName());
        }

        @Test
        public void canSetSellingPrice(){
            guitarAccessories.setSellingPrice(15);
            assertEquals(15, guitarAccessories.getSellingPrice(), 0.00);
        }

        @Test
        public void canGetPurchasedPrice(){
            assertEquals(7, guitarAccessories.getPurchasedPrice(), 0.00);
        }

        @Test
        public void canSetPurchasedPrice(){
            guitarAccessories.setPurchasedPrice(10);
            assertEquals(10, guitarAccessories.getPurchasedPrice(), 0.00);
        }

        @Test
        public void canGetCalculateMarkup(){
            assertEquals(8, guitarAccessories.calculateMarkup(), 0.00);
        }
}
