package MuseumExhibition;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;


public class SculptureTest {

    private Sculpture sculpture;

    @Mock
    private Author author;

    @Before
    public void setUp(){
        MockitoAnnotations.initMocks(this);
//        author = new Author("Test van Testvich", new int[]{1234, 1289});
        when(author.getBorn_year()).thenReturn(1234);
        when(author.getDeath_year()).thenReturn(1289);
        sculpture = new Sculpture("test_sculpture", author, 1245, MaterialType.Clay);
    }


    @Test
    public void testChangeCreationYear() throws Exception{
        sculpture.changeCreationYear(1245, author.getBorn_year(), author.getDeath_year());
        assertEquals(sculpture.getCreationYear(), 1245);
    }

    @Test(expected = YearValidationException.class)
    public void testYearValidationException() throws YearValidationException{
        sculpture.changeCreationYear(2000, author.getBorn_year(), author.getDeath_year());
    }

    @Test
    public void testSculptureEquality() throws Exception{
        Sculpture temp = new Sculpture("test_sculpture", author, 1245, MaterialType.Metal);
        assertEquals(sculpture, temp);
    }

    @Test
    public void testMaterialTypeChanging(){
        sculpture.setMaterial(MaterialType.Stone);
        assertEquals(sculpture.getMaterial(), MaterialType.Stone);
    }

}