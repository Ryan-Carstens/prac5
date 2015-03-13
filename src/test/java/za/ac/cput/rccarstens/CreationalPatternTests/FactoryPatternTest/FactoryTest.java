package za.ac.cput.rccarstens.CreationalPatternTests.FactoryPatternTest;

import org.junit.Before;
import org.junit.Test;
import za.ac.cput.rccarstens.CreationalPatterns.FactoryPattern.Employee;
import za.ac.cput.rccarstens.CreationalPatterns.FactoryPattern.EmployeeFactory;

import static org.junit.Assert.assertEquals;

public class FactoryTest
{
    EmployeeFactory ef;

    @Before
    public void setUp() throws Exception
    {
        ef = EmployeeFactory.getEmployeeFactoryInstance();
    }

    @Test
    public void testFactory() throws Exception
    {
        Employee lect = ef.getEmployeeRole("lecturer");

        String expected = "Lecturer at CPUT";
        String actual = lect.role();

        assertEquals(expected, actual);

    }
}
