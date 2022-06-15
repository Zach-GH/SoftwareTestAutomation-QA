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
 * AppointmentServiceTest class to test for arraylist functionality
 */

package test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Date;

import org.junit.jupiter.api.Test;

import appointmentService.Appointment;
import appointmentService.AppointmentService;

// 2 of 2 tests run: no errors or failures
// 93.8% coverage: AppointmentService class
// 100% coverage: AppointmentService ArrayList Object, deleteAppointment
// 87.1% coverage: addAppointment

class AppointmentServiceTest {

	// test add function
	@Test
	void testAdd() {
		AppointmentService as = new AppointmentService();
		Appointment test1 = new Appointment("12345", new Date(), "Description");
		assertTrue(as.addAppointment(test1));
	}
	
	// test delete function
	@Test
	void testDelete() {
		AppointmentService as = new AppointmentService();
		Appointment test1 = new Appointment("12345", new Date(), "Description");
		Appointment test2 = new Appointment("12346", new Date(), "Description");
		
		as.addAppointment(test1);
		as.addAppointment(test2);
		
		assertTrue(as.deleteAppointment("12346"));
		assertFalse(as.deleteAppointment("12347"));
		assertFalse(as.deleteAppointment("12346"));
	}

}
