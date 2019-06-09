package InstrumentTests;

import Instruments.Guitar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    private Guitar guitar;

    @Before

    public void setUp() {
        guitar = new Guitar(6, "String");

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
        assertEquals("strum strum twang", guitar.getSound());
    }
}

