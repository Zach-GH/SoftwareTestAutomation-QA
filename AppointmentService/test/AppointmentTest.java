/*
 * Author Name
 * Zachary Meisner
 * 
 * Date
 * 6/5/22
 * 
 * CourseID
 * CS-320-T5614 Software Test Automation & QA 22EW5
 * 
 * Brief Description
 * AppointmentTest class to test object parameters
 */

package test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Calendar;
import java.util.Date;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import appointmentService.Appointment;

// 7 of 7 tests run: no errors or failures
// 64.4% coverage: Appointment class 
// 100% coverage: Appointment object, getter methods

class AppointmentTest {

	// create future date variable for testing
	@SuppressWarnings("deprecation")
	Date appDate = new Date(2022, Calendar.JULY, 25);
	
	// create test object
	@Test
	void testAppointment() {
		Appointment appointment = new Appointment("12345", appDate, "Description");
		assertTrue(appointment.getId().equals("12345"));
		assertTrue(appointment.getAppointmentDate().equals(appDate));
		assertTrue(appointment.getDescription().equals("Description"));
	}
	
	// test ID for too long and null
	
	@Test
	void testIdTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Appointment("12345567891", appDate, "Description");
		});
	}
	
	@Test
	void testIdIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Appointment(null, appDate, "Description");
		});
	}
	
	// test date for in past and null
	
	@Test
	void testDateInPast() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Appointment("12345", new Date(0), "Description");
		});
	}
	
	@Test
	void testDateIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Appointment("12345", null, "Description");
		});
	}
	
	// test description for too long and null
	
	@Test
	void testDescriptionTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Appointment("12345", appDate, "The Test Description is way too long and this test case will surely throw an error.");
		});
	}
	
	@Test
	void testDescriptionIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Appointment("12345", appDate, null);
		});
	}

}
