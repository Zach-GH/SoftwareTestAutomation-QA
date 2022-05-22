package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import contactService.Contact;

class ContactTest {

	@Test
	void testContact() {
		Contact contact = new Contact("FirstName", "Last Name", "12345", "1234567891", "address");
		assertTrue(contact.getFirstName().equals("FirstName"));
		assertTrue(contact.getLastName().equals("Last Name"));
		assertTrue(contact.getId().equals("12345"));
		assertTrue(contact.getPhoneNumber().equals("1234567891"));
		assertTrue(contact.getAddress().equals("address"));
	}
	
	
	// First Name Tests
	
	@Test
	void testContactFirstNameTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("FirstNameIsTooLong", "Last Name", "12345", "1234567891", "address");
		});
	}
	
	@Test
	void testContactFirstNameIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact(null, "Last Name", "12345", "1234567891", "address");
		});
	}
	
	// Last Name Tests
	
	@Test
	void testContactLastNameTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("FirstName", "Last Name is too long", "12345", "1234567891", "address");
		});
	}
	
	@Test
	void testContactLastNameIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("FirstName", null, "12345", "1234567891", "address");
		});
	}
	
	// Id Tests
	
	@Test
	void testIdTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("FirstName", "Last Name", "12345567891", "1234567891", "address");
		});
	}
	
	@Test
	void testIdIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("FirstName", "Last Name", null, "1234567891", "address");
		});
	}
	
	// Phone Number Tests
	
	@Test
	void testPhoneNumberTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("FirstName", "Last Name", "12345", "12345678911", "address");
		});
	}
	
	@Test
	void testPhoneNumberTooShort() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("FirstName", "Last Name", "12345", "123456789", "address");
		});
	}
	
	@Test
	void testPhoneNumberIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("FirstName", "Last Name", "12345", null, "address");
		});
	}
	
	// Address Tests
	
	@Test
	void testAddressTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("FirstName", "Last Name", "12345", "1234567891", "This address is way too long to use");
		});
	}
	
	@Test
	void testAddressIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("FirstName", "Last Name", "12345", "1234567891", null);
		});
	}
}
