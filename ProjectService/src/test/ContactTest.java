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
 * ContactTest class to test object parameters and toString method
 */

package test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import contactService.Contact;
import dataFactory.ContactBuilder;

class ContactTest {
	
	// create a new Appointment object using the AppointmentBuilder
	// example of responsible way to make an object
	
	Contact contact = new ContactBuilder().
			firstName("firstName").
			lastName("lastName").
			id("12345").
			phoneNumber("1234567891").
			address("address").
			build();
	
	// Illegal Argument Exceptions thrown by DataFactory methods used to create bad objects
	
	@Test
	void testBadContacts() {
		assertAll(
				"null, strings too long",
					
				() -> Assertions.assertThrows(IllegalArgumentException.class, () -> {
					dataFactory.DataFactory.createNullContact();
					}),
				() -> Assertions.assertThrows(IllegalArgumentException.class, () -> {
					dataFactory.DataFactory.createTooLongContact();
					}),
				() -> Assertions.assertThrows(IllegalArgumentException.class, () -> {
					dataFactory.DataFactory.createPhoneTooShort();
					})
				);
	}
	
	// Assure that the ToString method works
	
	@Test
	void testToString() {
		String expected = dataFactory.DataFactory.createContact().toString(); // expected value goes here
		Assertions.assertEquals(expected, dataFactory.DataFactory.createContact().toString());
	}
	
}
