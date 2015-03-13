package za.ac.cput.rccarstens.BehaviouralPatternTests.ChainOfResponsibilityPatternTest;

/**
 * Created by student on 2015/03/12.
 */
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.rccarstens.BehaviouralPatterns.ChainOfResponsibilityPattern.*;

import static org.junit.Assert.assertEquals;

public class ChainOfResponsibilityTest {

    GradeHandler myGradeHandler;

    @Before
    public void setUp()
    {
        myGradeHandler = setUpChain();
    }

    public static GradeHandler setUpChain() {
        GradeHandler GAH = new GradeAHandler();
        GradeHandler GBH = new GradeBHandler();
        GradeHandler GCH = new GradeCHandler();
        GradeHandler GDH = new GradeDHandler();

        GAH.setSuccessor(GBH);
        GBH.setSuccessor(GCH);
        GCH.setSuccessor(GDH);

        return GAH;
    }
    @Test
    public void testAll() throws Exception
    {
        String expected = "C";
        String actual = myGradeHandler.handleRequest(67);
        assertEquals(expected, actual);
    }

}
