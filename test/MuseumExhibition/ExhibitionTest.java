package MuseumExhibition;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

public class ExhibitionTest {

    private Exhibition exhibition;
    @Mock
    private ArrayList<Exhibit> mockExhibits;
    @Mock
    private Author mockAuthor;
    @Mock
    private Painting painting;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);

        exhibition = new Exhibition("Test Exhibition");
        for (int i=0; i < 4; i++) {
            exhibition.addExhibit(painting);
        }
    }

    @Test
    public void checkGetExhibitsAmount() throws Exception {
        when(mockExhibits.size()).thenReturn(4);
        assertEquals(exhibition.getExhibitsAmount(), mockExhibits.size());
    }


}