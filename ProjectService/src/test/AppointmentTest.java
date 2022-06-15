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
 * AppointmentTest class to test object parameters and toString method
 */

package test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Calendar;
import java.util.Date;

import org.junit.jupiter.api.Assertions;

import org.junit.jupiter.api.Test;

import appointmentService.Appointment;
import dataFactory.AppointmentBuilder;


class AppointmentTest {
	
	@SuppressWarnings("deprecation")
	Date appDate = new Date(2022, Calendar.JULY, 25);
		
		
		// create a new Appointment object using the AppointmentBuilder
		// example of responsible way to make an object
		
		Appointment appointment = new AppointmentBuilder().
				id("12345").
				appointmentDate(appDate).
				description("description").
				build();
	
	// Illegal Argument Exceptions thrown by DataFactory methods used to create bad objects
		
	@Test
	void testBadAppointments() {
		assertAll(
				"null, strings too long, past date",
					
				() -> Assertions.assertThrows(IllegalArgumentException.class, () -> {
					dataFactory.DataFactory.createNullAppointment();
					}),
				() -> Assertions.assertThrows(IllegalArgumentException.class, () -> {
					dataFactory.DataFactory.createStringsTooLong();
					}),
				() -> Assertions.assertThrows(IllegalArgumentException.class, () -> {
					dataFactory.DataFactory.createAppointmentPastDate();
					})
				);
	}
	
	// Assure that the ToString method works
		
	@Test
	void testToString() {
		String expected = dataFactory.DataFactory.createAppointment().toString(); // expected value goes here
		Assertions.assertEquals(expected, dataFactory.DataFactory.createAppointment().toString());
	}
}
	

