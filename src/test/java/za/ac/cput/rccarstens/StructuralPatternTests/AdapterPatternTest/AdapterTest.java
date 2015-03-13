package za.ac.cput.rccarstens.StructuralPatternTests.AdapterPatternTest;

/**
 * Created by student on 2015/03/12.
 */
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.rccarstens.StructuralPatterns.AdapterPattern.SocketAdapter;
import za.ac.cput.rccarstens.StructuralPatterns.AdapterPattern.SocketClassAdapter;
import za.ac.cput.rccarstens.StructuralPatterns.AdapterPattern.SocketObjectAdapter;
import za.ac.cput.rccarstens.StructuralPatterns.AdapterPattern.Voltage;


import static org.junit.Assert.assertEquals;

public class AdapterTest {

    SocketAdapter mySA1;
    SocketAdapter mySA2;
    Voltage myVolt1;
    Voltage myVolt2;

    @Before
    public void setUp() throws Exception {
        mySA1 = new SocketClassAdapter();
        myVolt1 = mySA1.get3Volt();
        mySA2 = new SocketObjectAdapter();
        myVolt2 = mySA2.get240Volt();
    }

    @Test
    public void testClassAdapter() throws Exception
    {
        int expected = 3;
        int actual = myVolt1.getVolts();
        assertEquals(expected, actual);
    }

    @Test
    public void testObjectAdapter() throws Exception
    {
        int expected = 240;
        int actual = myVolt2.getVolts();
        assertEquals(expected, actual);
    }
}