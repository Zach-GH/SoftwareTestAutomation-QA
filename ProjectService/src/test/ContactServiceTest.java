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
 * ContactServiceTest assures that the methods for TaskService work properly
 */

package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import contactService.Contact;
import contactService.ContactService;

class ContactServiceTest {

	@Test
	void testAdd() {
		ContactService cs = new ContactService();
		Contact test1 = new Contact("Harry", "Potter", "12345", "1234567891", "Hogwarts");
		assertTrue(cs.addContact(test1));
	}

	@Test
	void testDelete() {
		ContactService cs = new ContactService();
		Contact test1 = new Contact("Harry", "Potter", "12345", "1234567891", "Hogwarts");
		Contact test2 = new Contact("Dudley", "Dursley", "12346", "1234567891", "4 Privet Drive");
		
		cs.addContact(test1);
		cs.addContact(test2);
		
		assertTrue(cs.deleteContact("12346"));
		assertFalse(cs.deleteContact("12347"));
		assertFalse(cs.deleteContact("12346"));
	}
	
	@Test
	void testUpdate() {
		ContactService cs = new ContactService();
		
		Contact test1 = new Contact("Harry", "Potter", "12345", "1234567891", "Hogwarts");
		
		cs.addContact(test1);
		
		assertTrue(cs.updateContact("Ron", "Weasley", "12345", "1987654321", "The Burrow"));
	}
}
