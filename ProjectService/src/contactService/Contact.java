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
 * Contact class initializes variables for object and sets parameters of what they can and cannot be
 */

package contactService;

public class Contact {
	
	 final private String firstName;
	 final private String lastName;
	 final private String id;
	 final private String phoneNumber;
	 final private String address;
	
	public Contact(String firstName, String lastName, String id, String phoneNumber, String address) {
		
		super();
		
		if(firstName == null || firstName.length() > 10) {
			throw new IllegalArgumentException("Invalid first name");
		}
		
		if(lastName == null || lastName.length() > 10) {
			throw new IllegalArgumentException("Invalid last name");
		}
		
		if(id == null || id.length() > 10) {
			throw new IllegalArgumentException("Invalid id");
		}
		
		if(phoneNumber == null || phoneNumber.length() != 10) {
			throw new IllegalArgumentException("Invalid phone number");
		}
		
		if(address == null || address.length() > 30) {
			throw new IllegalArgumentException("Invalid address");
		}
		
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.id = id;
		this.phoneNumber = phoneNumber;
		this.address = address;
	}
	
	// getters 

	public String getId() {
		return id;
	}


	@Override
	public String toString() {
		return "Contact: firstName = " + firstName + ", lastName = " + lastName + 
				", id = " + id + ", phoneNumber = " + phoneNumber + ", address = " + address;
	}
}
