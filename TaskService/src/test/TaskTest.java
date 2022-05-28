/*
 * Zachary Meisner
 * 5/28/22
 * CS-320-T5614
 * TaskTest allows us to test object and corresponding variable parameters
 * Testing all variables for null, and length of entry.
 * 7/7 Tests pass with no errors or failures
 * Task class has 63.5% Test Coverage
 */
package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import taskService.Task;

class TaskTest {

	@Test
	void testTask() {
		Task task = new Task("1234567891", "Name", "Description");
		assertTrue(task.getTaskId().equals("1234567891"));
		assertTrue(task.getName().equals("Name"));
		assertTrue(task.getDescription().equals("Description"));
	}
	
	// TaskId Tests
	
	@Test
	void testIdTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Task("12345567891", "Name", "Description");
		});
	}
	
	@Test
	void testIdIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Task(null, "Name", "Description");
		});
	}
	
	// Name Tests
	
	@Test
	void nameTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Task("1234567891", "TheNameOfThisObjectIsWayMoreThanTwentyCharactersLong", "Description");
		});
	}
	
	@Test
	void nameIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Task("1234567891", null, "Description");
		});
	}
	
	// Description Tests
	
	@Test
	void descriptionTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Task("1234567891", "Name", "This description is way too long for the object and will throw an illegal argument exception");
		});
	}
	
	@Test
	void descriptionIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Task("1234567891", "Name", null);
		});
	}

}
