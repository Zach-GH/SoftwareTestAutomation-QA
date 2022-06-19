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
 * AppointmentService class to create arrayList and functions to add/delete objects
 */

package appointmentService;

import java.util.ArrayList;

public class AppointmentService {
	
	// create arraylist of appointments
	
	private ArrayList<Appointment> appointments;
	
	public AppointmentService() {
		
		appointments = new ArrayList<>();
	}
	
	// create add appointment function
	public boolean addAppointment(Appointment appointment) {
		boolean appointmentExists = false;
		// if appointment exists already do not add
		for (Appointment appointmentList:appointments) {
			if (appointmentList.equals(appointment)) {
				appointmentExists = true;
			}
		}
		// if appointment does not exist, then add
		if (!appointmentExists) {
			appointments.add(appointment);
			return true;
		}
		else {
			return false;
		}
	}

	// create delete appointment function
	public boolean deleteAppointment(String string) {
		// look through existing appointments, and if ID matches then remove appointment
		for(Appointment appointmentList:appointments) {
			if (appointmentList.getId().equals(string)) {
				appointments.remove(appointmentList);
				return true;
			}
		}
		return false;
	}
}
