package SundriesTests;

import org.junit.Before;
import org.junit.Test;
import sundries.Scores;

import static org.junit.Assert.assertEquals;

public class ScoresTest {

        private Scores scores;

        @Before
        public void setUp(){
            scores = new Scores("Classical", 15, 7);
        }

        @Test
        public void canSetName() {
            scores.setName("Pop");
            assertEquals("Pop", scores.getName());
        }

        @Test

        public void canGetName() {
            assertEquals("Classical", scores.getName());
        }

        @Test
        public void canSetSellingPrice(){
            scores.setSellingPrice(15);
            assertEquals(15, scores.getSellingPrice(), 0.00);
        }

        @Test
        public void canGetPurchasedPrice(){
            assertEquals(7, scores.getPurchasedPrice(), 0.00);
        }

        @Test
        public void canSetPurchasedPrice(){
            scores.setPurchasedPrice(10);
            assertEquals(10, scores.getPurchasedPrice(), 0.00);
        }

        @Test
        public void canGetCalculateMarkup(){
            assertEquals(7, scores.calculateMarkup(), 0.00);
        }
}
