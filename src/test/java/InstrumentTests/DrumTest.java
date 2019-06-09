package InstrumentTests;


import Instruments.Drum;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DrumTest {

    private Drum drum;

    @Before

    public void setUp(){
        drum = new Drum("Snare", "percussion");

    }

    @Test
    public void canGetSection(){
        assertEquals("percussion", drum.getSection());
    }

    @Test
    public void canGetTypeOfDrum(){
        assertEquals("Snare", drum.getTypeOfDrum());
    }

    @Test
    public void canMakeSound(){
        assertEquals("Boom boom", drum.getSound());
    }
}
