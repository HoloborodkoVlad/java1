package MuseumExhibition;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

public class PaintingTest {

    private Painting paiting;

    @Mock
    private Author author;

    @Before
    public void setUp() {
//        author = new Author("Test van Testvich", new int[]{1234, 1289});
        MockitoAnnotations.initMocks(this);
        when(author.getBorn_year()).thenReturn(1234);
        when(author.getDeath_year()).thenReturn(1289);
        paiting = new Painting("test_sculpture", author, 1245, 200, 300);
    }

    @Test
    public void testChangeCreationYear() throws Exception{
        paiting.changeCreationYear(1245, author.getBorn_year(), author.getDeath_year());
        assertEquals(paiting.getCreationYear(), 1245);
    }

    @Test(expected = YearValidationException.class)
    public void testYearValidationException() throws YearValidationException {
        paiting.changeCreationYear(2000, author.getBorn_year(), author.getDeath_year());
    }

    @Test
    public void testSculptureEquality() throws Exception {
        Painting temp = new Painting("test_sculpture", author, 1245, 800, 900);
        assertEquals(paiting, temp);
    }


}