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
 * Builder class initializes variables to build an Contact object for testing and updating objects
 */

package dataFactory;

import contactService.Contact;

public class ContactBuilder {
	
	private String firstName;
	private String lastName;
	private String id;
	private String phoneNumber;
	private String address;
	
	public ContactBuilder firstName(String firstName) {
		this.firstName = firstName;
		return this;
	}
	
	public ContactBuilder lastName(String lastName) {
		this.lastName = lastName;
		return this;
	}
	
	public ContactBuilder id(String id) {
		this.id = id;
		return this;
	}
	
	public ContactBuilder phoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
		return this;
	}
	
	public ContactBuilder address(String address) {
		this.address = address;
		return this;
	}
	
	public Contact build() {
		return new Contact(firstName, lastName, id, phoneNumber, address);
	}
	

}
