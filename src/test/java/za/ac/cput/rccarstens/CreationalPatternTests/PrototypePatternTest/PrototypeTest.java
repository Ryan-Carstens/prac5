package za.ac.cput.rccarstens.CreationalPatternTests.PrototypePatternTest;


import org.junit.Before;
import org.junit.Test;
import za.ac.cput.rccarstens.CreationalPatterns.PrototypePattern.*;

import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertEquals;

public class PrototypeTest
{
    Subject sub;
    Subject sub2;

    @Before
    public void setUp() throws Exception
    {
        sub = new Subject("TP002");
        sub2 = (Subject)sub.makeCopy();
    }

    @Test
    public void testPrototype() throws Exception
    {
        assertNotEquals(sub.hashCode(), sub2.hashCode());
    }

    @Test
    public void testPrototype2() throws Exception
    {
        assertEquals(sub.toString(), sub2.toString());
    }
}
