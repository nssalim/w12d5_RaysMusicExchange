import music_shop.SheetMusic;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SheetMusicTest {

    SheetMusic sheetMusic;

    @Before
    public void before() {
        sheetMusic = new SheetMusic("Jam with Buddy Holly", true, 10, 15);
    }

    @Test
    public void hasTitle() {
        assertEquals("Jam with Buddy Holly", sheetMusic.getTitle());
    }

    @Test
    public void hasDigitalCopy() {
        assertEquals(true, sheetMusic.getDigitalCopy());
    }

    @Test
    public void hasCostPrice() {
        assertEquals(10, sheetMusic.getCostPrice());
    }

    @Test
    public void hasRetailPrice() {
        assertEquals(15, sheetMusic.getRetailPrice());
    }

    @Test
    public void getMarkUp() {
        assertEquals(5, sheetMusic.getMarkup());
    }
}