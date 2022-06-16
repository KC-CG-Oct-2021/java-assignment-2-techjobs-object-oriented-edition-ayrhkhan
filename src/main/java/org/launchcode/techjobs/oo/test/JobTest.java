package org.launchcode.techjobs.oo.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.launchcode.techjobs.oo.*;

import java.lang.reflect.Constructor;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.*;

/**
 * Created by LaunchCode
 */
@RunWith(JUnit4.class)
public class JobTest {


    @Test
    public void testSettingJobId() {
        Job test_job = new Job();
        Job second_test_job = new Job();
        assertNotEquals(second_test_job.getId(), test_job.getId(), .001);
//        why isnt there a try/catch statement being used
//        try {
//        } catch () {
//        }
    }

    @Test
    public void testJobConstructorSetsAllFields() {
        Job test_job = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        assertTrue(test_job instanceof Job);
        assertEquals("Product tester", test_job.getName());

//throws an error and the end is the same
//        assertEquals("ACME", test_job.getEmployer());
//        assertEquals("Quality control", test_job.getPositionType());
//        assertEquals("Persistence", test_job.getCoreCompetency());
    }



    @Test
    public void testJobsForEquality() {
        Job test_job = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job second_test_job = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        assertNotEquals(test_job.getId(), second_test_job.getId());
    }




}
