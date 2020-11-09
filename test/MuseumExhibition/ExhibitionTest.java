package MuseumExhibition;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ExhibitionTest {

    private Exhibition exhibition;
    private Exhibit[] temp_exhibits;
    private Author author;

    @Before
    public void setUp() {
        exhibition = new Exhibition("Test Exhibition");
        author = new Author("Test Author", new int[] {1992, 2020});
        temp_exhibits = new Exhibit[] {
                new Painting("test_painting", author, 2010, 100, 200),
                new Painting("test_painting", author, 2010, 100, 200),
                new Sculpture("test_painting", author, 2010, MaterialType.Stone),
                new Sculpture("test_painting", author, 2010, MaterialType.Stone)
        };
        for (Exhibit e: temp_exhibits) {
            exhibition.addExhibit(e);
        }
    }

    @Test
    public void checkGetExhibitsAmount() throws Exception {
        assertEquals(exhibition.getExhibitsAmount(), temp_exhibits.length);
    }


    @Test
    public void testExhibitsOfExhibitionEquality() throws Exception{
        assertArrayEquals(exhibition.getExhibits().toArray(), temp_exhibits);
    }

}