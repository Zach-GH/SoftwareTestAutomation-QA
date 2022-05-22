package contactService;

import java.util.ArrayList;

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
				contactList.setFirstName(firstName);
				contactList.setLastName(lastName);
				contactList.setPhoneNumber(phoneNumber);
				contactList.setAddress(address);
			}
			return true;
		}
		return false;
	}
}
