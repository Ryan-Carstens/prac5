package za.ac.cput.rccarstens.CreationalPatternTests.AbstractFactoryTest;


import org.junit.Before;
import org.junit.Test;
import za.ac.cput.rccarstens.CreationalPatterns.abfact.*;

import static org.junit.Assert.assertEquals;

public class FactoryTest {

    SubjectsFactory secondyrsubjectsFactory;
    @Before
    public void setUp() throws Exception {
        secondyrsubjectsFactory = FactoryProducer.getFactory("2nd");
    }

    @Test
    public void testFactory() throws Exception
    {
        Subject ds2 = secondyrsubjectsFactory.getSubjectName("DS");
        String expected = "Development Software 2";
        String actual = ds2.getSubjectName();

        assertEquals(expected, actual);
    }
}
