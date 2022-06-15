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
 * Builder class initializes variables to build an Appointment object for testing and updating objects
 */

package dataFactory;

import java.util.Date;

import appointmentService.Appointment;

public class AppointmentBuilder {

	private String id;
	private Date appointmentDate;
	private String description;
	
	public AppointmentBuilder id(String id) {
		this.id = id;
		return this;
	}
	
	public AppointmentBuilder appointmentDate(Date appointmentDate) {
		this.appointmentDate = appointmentDate;
		return this;
	}
	
	public AppointmentBuilder description(String description) {
		this.description = description;
		return this;
	}
	
	public Appointment build() {
		return new Appointment(id, appointmentDate, description);
	}
}
