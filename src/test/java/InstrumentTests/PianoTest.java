package InstrumentTests;



import Instruments.Piano;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class PianoTest {

    private Piano piano;

    @Before

    public void setUp(){
        piano = new Piano("Bosendorfer", "String");

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
        assertEquals("tinkle tinkle pling", piano.getSound());
    }
}