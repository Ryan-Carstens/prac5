package za.ac.cput.rccarstens.CreationalPatternTests.SingletonPatternTest;

import org.junit.Before;
import org.junit.Test;
import za.ac.cput.rccarstens.CreationalPatterns.SingletonPattern.Calculator;

import static org.junit.Assert.assertEquals;

public class SingletonTest
{
    Calculator calc;

    @Before
    public void setup()
    {
        calc = Calculator.getInstance();
    }

    @Test
    public void testSingleton() throws Exception
    {
        Calculator calc2 = Calculator.getInstance();
        assertEquals(calc.hashCode(), calc2.hashCode());
    }
}
