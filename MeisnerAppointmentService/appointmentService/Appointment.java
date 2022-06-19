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
 * Appointment class to create object
 */

package appointmentService;

import java.util.Date;

public class Appointment {

	private String id;
	private Date appointmentDate;
	private String description;
	
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
	
	public Date getAppointmentDate() {
		return appointmentDate;
	}
	
	public String getDescription() {
		return description;
	}
	
	// setters
	
	public void setId(String id) {
		this.id = id;
	}
	
	public void setDate(Date appointmentDate) {
		this.appointmentDate = appointmentDate;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	// toString function for object output
	
	@Override
	public String toString() {
		return "Appointment: id = " + id + ", Date = " + appointmentDate + ", Description = " + description;
	}
}
