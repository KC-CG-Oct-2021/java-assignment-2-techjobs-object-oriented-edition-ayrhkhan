package org.launchcode.techjobs.oo.test;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.launchcode.techjobs.oo.*;

import java.lang.reflect.Constructor;
import java.util.Objects;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.*;
import static org.junit.Assert.assertFalse;

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
//        assertFalse(test_job.getId(), second_test_job.getId());
    }

    @Test
    public void testToStringFormattingMyTest() {
        Job test_job = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        assertEquals("\nID: 1\n" +
                "Name: Product tester\n" +
                "Employer: ACME\n" +
                "Location: Desert\n" +
                "Position Type: Quality control\n" +
                "Core Competency: Persistence\n",  test_job.toString());
    }


    @Test
    public void testToStringStartsAndEndsWithNewLine() {
        Job test_job = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

//        assertEquals(test_job.toString().charAt(0),"\n");
//this doesnt work at all
//        assertEquals(test_job.toString().charAt(test_job.toString().legnth()),"\n");

        assertEquals("\n"+
                "ID: 1\n" +
                "Name: Product tester\n" +
                "Employer: ACME\n" +
                "Location: Desert\n" +
                "Position Type: Quality control\n" +
                "Core Competency: Persistence"+
                "\n",  test_job.toString());

    }


    @Test
    public void testToStringContainsCorrectLabelsAndData() {
        Job test_job = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));


        assertEquals("\nID: 1\n" +
                "Name: Product tester\n" +
                "Employer: ACME\n" +
                "Location: Desert\n" +
                "Position Type: Quality control\n" +
                "Core Competency: Persistence\n",  test_job.toString());
    }


    @Test
    public void testToStringHandlesEmptyField() {
        Job test_job = new Job("", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

//        String nullDefault = "Data not available";
//        System.out.println(Objects.toString(test_job, nullDefault));
//https://www.educative.io/answers/what-is-objectstostring-in-java
        assertEquals( "\nID: 1\n" +
                "Name: Data not available\n" +
                "Employer: ACME\n" +
                "Location: Desert\n" +
                "Position Type: Quality control\n" +
                "Core Competency: Persistence\n", test_job.toString());
    }






}
