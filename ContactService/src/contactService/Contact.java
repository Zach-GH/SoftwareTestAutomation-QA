package contactService;

public class Contact {
	
	private String firstName;
	private String lastName;
	private String id;
	private String phoneNumber;
	private String address;
	
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
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public String getId() {
		return id;
	}
	
	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	public String getAddress() {
		return address;
	}
	
	// setters
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Contact: firstName = " + firstName + ", lastName = " + lastName + 
				", id = " + id + ", phoneNumber = " + phoneNumber + ", address = " + address;
	}
}
