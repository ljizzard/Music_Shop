package InstrumentTests;

import Instruments.Saxophone;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SaxophoneTest {

    private Saxophone saxophone;

    @Before

    public void setUp(){
        saxophone = new Saxophone("Alto", "Woodwind");
    }

    @Test
    public void getSaxophoneType() {
        assertEquals("Alto", saxophone.getSaxophoneType());
    }

    @Test
    public void canMakeSound(){
        assertEquals("Doo doo doo", saxophone.getSound());
    }


}