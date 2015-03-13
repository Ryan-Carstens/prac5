package za.ac.cput.rccarstens.CreationalPatternTests.BuilderPatternTest;

import org.junit.Before;
import org.junit.Test;
import za.ac.cput.rccarstens.CreationalPatterns.BuilderPattern.DiplomaCourse;
import za.ac.cput.rccarstens.CreationalPatterns.BuilderPattern.DiplomaCourseDirector;
import za.ac.cput.rccarstens.CreationalPatterns.BuilderPattern.SecondYearDiplomaCourseBuilder;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class BuilderTest {

        DiplomaCourseDirector director;
        DiplomaCourse course;

        @Before
        public void setUp() throws Exception
        {
            director = new DiplomaCourseDirector(new SecondYearDiplomaCourseBuilder());
            director.constructDiplomaCourse();
            course = director.getDiplomaCourse();
        }

        @Test
        public void testBuilder() throws Exception
        {
            assertNotNull(course);
        }

        @Test
        public void testBuilder2() throws Exception
        {
            String expected = "Technical Programming 1";
            String actual = course.getTechnicalPrograming();
            assertEquals(expected, actual);
        }
}
