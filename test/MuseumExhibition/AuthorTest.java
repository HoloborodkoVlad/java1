package MuseumExhibition;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class AuthorTest {

    private Author author1, author2;

    @Before
    public void setUp() throws Exception{
        author1 = new Author("Test", "Testing", new int[]{1819, 2020});
        author2 = new Author("Test van Testovich", new int[]{1829, 2020});
    }

    @Test
    public void checkAuthorConstructorWithTwoArguments() throws Exception{
        assertEquals(author2.getName(), "Test");
        assertEquals(author2.getSurname(), "van Testovich");
    }

    @Test
    public void checkAuthorConstructorWithThreeArguments() throws Exception{
        assertEquals(author1.getName(), "Test");
        assertEquals(author1.getSurname(), "Testing");
    }


    @Test
    public void checkAuthorInitials() throws Exception{
        assertEquals(author1.getInitials(), "T. T.");
        assertEquals(author2.getInitials(), "T. T.");
    }
}