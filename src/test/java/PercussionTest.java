import music_shop.InstrumentType;
import music_shop.Percussion;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PercussionTest {

    Percussion percussion;

    @Before
    public void before() {
        percussion = new Percussion("British Drum Company", "Legend Series", "Black", 3, 500, 700);
    }

    @Test
    public void hasMake() {
        assertEquals("British Drum Company", percussion.getMake());
    }

    @Test
    public void hasModel() {
        assertEquals("Legend Series", percussion.getModel());
    }

    @Test
    public void hasColour() {
        assertEquals("Black", percussion.getColour());
    }

    @Test
    public void hasNumberOfPieces() {
        assertEquals(3, percussion.getNumberOfPieces());
    }

    @Test
    public void hasType() {
        assertEquals(InstrumentType.PERCUSSION, percussion.getType());
    }

    @Test
    public void canPlay() {
        assertEquals("Fade Away by Buddy Holly", percussion.play());
    }

    @Test
    public void hasCostPrice() {
        assertEquals(500, percussion.getCostPrice());
    }

    @Test
    public void hasRetailPrice() {
        assertEquals(700, percussion.getRetailPrice());
    }

    @Test
    public void getMarkUp() {
        assertEquals(200, percussion.getMarkup());
    }
}
