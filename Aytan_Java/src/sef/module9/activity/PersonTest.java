
package sef.module9.activity;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PersonTest {

    private Person person;

    // Initialize Person object before each test
    @Before
    public void setUp() {
        person = new Person();
    }

    // Clear Person object after each test
    @After
    public void tearDown() {
        person = null;
    }

    // Test getters and setters
    @Test
    public void testGettersAndSetters() {

        person.setWeight(65);
        person.setHeight(1.7f);

        assertEquals(65, person.getWeight());
        assertEquals(1.7f, person.getHeight(), 0.001f);
    }

    // Test BMI calculations
    @Test
    public void testGetBodyMassIndex() {

        // Test valid BMI categories
        assertEquals("Underweight", person.getBodyMassIndex(50, 1.8));
        assertEquals("Normal weight", person.getBodyMassIndex(65, 1.7));
        assertEquals("Overweight", person.getBodyMassIndex(80, 1.7));
        assertEquals("Obese", person.getBodyMassIndex(90, 1.7));

        // Test BMI classification boundaries
        assertEquals("Underweight", person.getBodyMassIndex(18, 1.0));
        assertEquals("Normal weight", person.getBodyMassIndex(18.5, 1.0));
        assertEquals("Overweight", person.getBodyMassIndex(25, 1.0));
        assertEquals("Obese", person.getBodyMassIndex(30, 1.0));

        // Test invalid weight values
        assertEquals("Invalid input", person.getBodyMassIndex(0, 1.7));
        assertEquals("Invalid input", person.getBodyMassIndex(-10, 1.7));
        assertEquals("Invalid input", person.getBodyMassIndex(601, 1.7));

        // Test invalid height values
        assertEquals("Invalid input", person.getBodyMassIndex(65, 0));
        assertEquals("Invalid input", person.getBodyMassIndex(65, -1.7));
        assertEquals("Invalid input", person.getBodyMassIndex(65, 3.1));

        // Test maximum allowed inputs
        assertEquals("Obese", person.getBodyMassIndex(600, 3.0));
    }
}
