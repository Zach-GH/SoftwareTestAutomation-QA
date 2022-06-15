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
 * TaskTest class to test object parameters and toString method
 */

package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import dataFactory.TaskBuilder;
import taskService.Task;

class TaskTest {

	// create a new Appointment object using the AppointmentBuilder
	// example of responsible way to make an object
	
	Task task = new TaskBuilder().
			taskId("12345").
			name("name").
			description("description").
			build();
	
	// Illegal Argument Exceptions thrown by DataFactory methods used to create bad objects
	
	@Test
	void testBadTasks() {
		assertAll(
				"null, strings too long",
					
				() -> Assertions.assertThrows(IllegalArgumentException.class, () -> {
					dataFactory.DataFactory.createNullTask();
					}),
				
				() -> Assertions.assertThrows(IllegalArgumentException.class, () -> {
					dataFactory.DataFactory.createTooLongTask();
					})
				);
	}
	
	// Assure that the ToString method works
	
	@Test
	void testToString() {
		String expected = dataFactory.DataFactory.createTask().toString(); // expected value goes here
		Assertions.assertEquals(expected, dataFactory.DataFactory.createTask().toString());
	}

}
