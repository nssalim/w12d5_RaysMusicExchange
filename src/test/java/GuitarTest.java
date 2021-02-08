import music_shop.Guitar;
import music_shop.InstrumentType;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class GuitarTest {

    Guitar guitar;

    @Before
    public void before() {
        guitar = new Guitar("Fender", "Stratocaster", "Sunburst", 6, 150, 200);
    }

    @Test
    public void hasMake() {
        assertEquals("Fender", guitar.getMake());
    }

    @Test
    public void hasModel() {
        assertEquals("Stratocaster", guitar.getModel());
    }

    @Test
    public void hasColour() {
        assertEquals("Sunburst", guitar.getColour());
    }

    @Test
    public void hasType() {
        assertEquals(InstrumentType.STRING, guitar.getType());
    }

    @Test
    public void hasNumberOfStrings() {
        assertEquals(6, guitar.getNumberOfStrings());
    }

    @Test
    public void canPlay() {
        assertEquals("Buddy Holly's unconventional strumming technique...", guitar.play());
    }

    @Test
    public void hasCostPrice() {
        assertEquals(150, guitar.getCostPrice());
    }

    @Test
    public void hasRetailPrice() {
        assertEquals(200, guitar.getRetailPrice());
    }

    @Test
    public void canGetMarkup() {
        assertEquals(50, guitar.getMarkup());
    }


}
