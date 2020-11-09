package MuseumExhibition;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class PaintingTest {

    private Painting paiting;
    private Author author;

    @BeforeClass
    public void setUp() {
        author = new Author("Test van Testvich", new int[]{1234, 1289});
        paiting = new Painting("test_sculpture", author, 1245, 200, 300);
    }

    @Test(expected = YearValidationException.class)
    public void testYearValidationException() throws YearValidationException {
        paiting.changeCreationYear(2000, author);
    }

    @Test
    public void testSculptureEquality() throws Exception {
        Painting temp = new Painting("test_sculpture", author, 1245, 800, 900);
        assertEquals(paiting, temp);
    }


}