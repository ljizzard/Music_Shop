package shopTest;

import Instruments.Drum;
import Instruments.Guitar;
import Instruments.Piano;
import Instruments.Saxophone;
import org.junit.Before;
import org.junit.Test;
import shop.Shop;
import sundries.Drumsticks;
import sundries.GuitarAccessories;
import sundries.Scores;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    private Shop shop;
    private Guitar guitar;
    private Saxophone saxophone;
    private Piano piano;
    private Drum drum;
    private Drumsticks drumsticks;
    private Scores scores;
    private GuitarAccessories guitarAccessories;


    @Before
    public void setUp(){
        guitar = new Guitar(6,"Strings", 2000, 1500);
        drum = new Drum("Bass", "percussion", 2000, 1500 );
        piano = new Piano("Steinway", "Strings", 2000, 1500);
        saxophone = new Saxophone("Alto", "Woodwind", 2000, 1500);
        drumsticks = new Drumsticks("Brush", 15, 7);
        scores = new Scores("Jazz", 15, 7);
        guitarAccessories = new GuitarAccessories ("pick", 2, 1);
        shop = new Shop("Don't shop here");
    }


    @Test
    public void stockStartsEmpty(){
        assertEquals(0, shop.stockItemCount());
    }

    @Test
    public void canAddInstrumentStock(){
        shop.addStock(drum);
        assertEquals(1, shop.stockItemCount());
    }

    @Test
    public void canAddAccessoryStock(){
        shop.addStock(piano);
        assertEquals(1, shop.stockItemCount());
    }

    @Test
    public void canRemoveStock(){
        shop.addStock(guitar);
        shop.addStock(saxophone);
        shop.sellStock(guitar);
        assertEquals(1, shop.stockItemCount());
    }

    @Test
    public void canOnlyRemoveStockWhichIsInStock(){
        shop.addStock(guitar);
        shop.addStock(saxophone);
        shop.sellStock(piano);
        assertEquals(2, shop.stockItemCount());
    }

    @Test
    public void canCalculateProfit(){
        shop.addStock(guitar);
        shop.addStock(drumsticks);
        assertEquals(508, shop.calculateProfit(), 0.00);
    }

    @Test
    public void CalculateTotalAvailableProfit(){
        shop.addStock(guitar);
        shop.addStock(drum);
        shop.addStock(piano);
        shop.addStock(saxophone);
        shop.addStock(drumsticks);
        shop.addStock(scores);
        shop.addStock(guitarAccessories);
        assertEquals(2017, shop.calculateProfit(), 0.00);
    }




}
