/*
 * Author Name
 * Zachary Meisner
 * 
 * Date
 * 6/9/22
 * 
 * CourseID
 * CS-320-T5614 Software Test Automation & QA 22EW5
 * 
 * Brief Description
 * DataFactory class is used to create methods that safely build objects
 * in addition to creating objects that violate the initial parameters of each variable to assure functionality.
 * This DataFactory class in addition to the builder classes helped me reach code coverage above 80%
 */

package dataFactory;

import java.util.Date;

import appointmentService.Appointment;
import contactService.Contact;
import taskService.Task;

public class DataFactory {
	
	private DataFactory() {}
	
	// Appointment Builders
	
	public static Appointment createAppointment() {
		return new AppointmentBuilder().id("12345").
				appointmentDate(new Date()).description("description").build();
	}
	
	public static Appointment createNullAppointment() {
		return new AppointmentBuilder().id(null).
				appointmentDate(null).description(null).build();
	}
	
	public static Appointment createStringsTooLong() {
		return new AppointmentBuilder().id("1234556789").
				appointmentDate(new Date()).description("thisdescriptionisveryobviouslytoolongandshouldfailtheunittest").build();
	}
	
	public static Appointment createAppointmentPastDate() {
		return new AppointmentBuilder().id("12345").
				appointmentDate(new Date(0)).description("description").build();
	}
	
	// Contact Builders
	
	public static Contact createContact() {
		return new ContactBuilder().firstName("firstName").lastName("lastName")
				.id("12345").phoneNumber("1234567891").address("address").build();
	}
	
	
	public static Contact createNullContact() {
		return new ContactBuilder().firstName(null).lastName(null)
				.id(null).phoneNumber(null).address(null).build();
	}
	
	public static Contact createTooLongContact() {
		return new ContactBuilder().firstName("firstNameIsTooLong").lastName("lastNameIsTooLong")
				.id("1234556789").phoneNumber("12345567891").address("ThisAddressIsWayTooLongAndWillDefinitelyFailTheTest").build();
	}
	
	public static Contact createPhoneTooShort() {
		return new ContactBuilder().firstName("firstName").lastName("lastName")
				.id("12345").phoneNumber("123456789").address("address").build();
	}

	// Task Builders
	
	public static Task createTask() {
		return new TaskBuilder().taskId("12345").name("name")
				.description("description").build();
	}
	
	public static Task createNullTask() {
		return new TaskBuilder().taskId(null).name(null)
				.description(null).build();
	}
	
	public static Task createTooLongTask() {
		return new TaskBuilder().taskId("12345678911").name("ThisNameIsDefinitelyWayTooLongAndWillNotPassTheTest")
				.description("ThisDescriptionIsWayTooLongAndWillDefinitelyFailTheTest").build();
	}
}
