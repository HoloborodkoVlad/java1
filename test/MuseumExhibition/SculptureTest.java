package MuseumExhibition;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class SculptureTest {

    private Sculpture sculpture;
    private Author author;

    @BeforeClass
    public void setUp(){
        author = new Author("Test van Testvich", new int[]{1234, 1289});
        sculpture = new Sculpture("test_sculpture", author, 1245, MaterialType.Clay);
    }

    @Test(expected = YearValidationException.class)
    public void testYearValidationException() throws YearValidationException{
        sculpture.changeCreationYear(2000, author);
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