import music_shop.InstrumentType;
import music_shop.Piano;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PianoTest {

    Piano piano;

    @Before
    public void before() {
        piano = new Piano("Steinway & Sons", "Boston Upright", "Black", 88, 3000, 4000);
    }

    @Test
    public void hasMake() {
        assertEquals("Steinway & Sons", piano.getMake());
    }

    @Test
    public void hasModel() {
        assertEquals("Boston Upright", piano.getModel());
    }

    @Test
    public void hasColour() {
        assertEquals("Black", piano.getColour());
    }

    @Test
    public void hasNumberOfKeys() {
        assertEquals(88, piano.getNumberOfKeys());
    }

    @Test
    public void hasType() {
        assertEquals(InstrumentType.KEYBOARD, piano.getType());
    }

    @Test
    public void canPlay() {
        assertEquals("Every Day by Buddy Holly", piano.play());
    }

    @Test
    public void hasCostPrice() {
        assertEquals(3000, piano.getCostPrice());
    }

    @Test
    public void hasRetailPrice() {
        assertEquals(4000, piano.getRetailPrice());
    }

    @Test
    public void getMarkUp() {
        assertEquals(1000, piano.getMarkup());
    }
}