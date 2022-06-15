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
 * Appointment class initializes variables for object and sets parameters of what they can and cannot be
 */

package appointmentService;

import java.util.Date;

public class Appointment {

	final private String id;
	final private Date appointmentDate;
	final private String description;
	
	// set paramaters for appointment object
	public Appointment(String id, Date appointmentDate, String description) {
		
		super();
		
		// id cannot be null or greater than 10 characters
		if(id == null || id.length() > 10) {
			throw new IllegalArgumentException("Invalid id");
		}
		
		// date cannot be before present date or null
		if(appointmentDate == null || appointmentDate.before(new Date())) {
			throw new IllegalArgumentException("Invalid date");
		}
		
		// description cannot be null or over 50 characters
		if(description == null || description.length() > 50) {
			throw new IllegalArgumentException("Invalid description");
		}
		
		// instantiate variables for object
		this.id = id;
		this.appointmentDate = appointmentDate;
		this.description = description;
	}
	
	// getters
	
	public String getId() {
		return id;
	}

	
	// toString function for object output
	
	@Override
	public String toString() {
		return "Appointment: id = " + id + ", Date = " + appointmentDate + ", Description = " + description;
	}
}
