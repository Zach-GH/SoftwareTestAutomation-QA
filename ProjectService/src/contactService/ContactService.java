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
 * ContactService uses an ArrayList to add functionality for adding, updating, and deleting objects
 */

package contactService;

import java.util.ArrayList;

import dataFactory.ContactBuilder;

public class ContactService {

	private ArrayList<Contact> contacts;
	
	public ContactService() {
		
		// create array list for objects
		contacts = new ArrayList<>();
	}
	// add contacts
	public boolean addContact(Contact contact) {
		boolean contactExists = false;
		// loop through contacts in list, if no contact in list then add contact
		for (Contact contactList:contacts) {
			if (contactList.equals(contact)) {
				contactExists = true;
			}
		}
		if (!contactExists) {
			contacts.add(contact);
			return true;
		}
		else {
			return false;
		}
	}
	
	// delete contacts
	public boolean deleteContact(String string) {
		for(Contact contactList:contacts) {
			if (contactList.getId().equals(string)) {
				contacts.remove(contactList);
				return true;
			}
		}
		return false;
	}
	
	// update contacts
	public boolean updateContact(String firstName, String lastName, String id, String phoneNumber, String address) {
		for (Contact contactList:contacts) {
			if (contactList.getId().equals(id)) {
				contacts.remove(contactList);
				Contact updatedContact = new ContactBuilder().
						firstName("firstName").
						lastName("lastName").
						id(id).
						phoneNumber("1234567891").
						address("address").
						build();
				contacts.add(updatedContact);
			}
			return true;
		}
		return false;
	}
}
