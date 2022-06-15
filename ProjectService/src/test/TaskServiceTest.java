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
 * TaskServiceTest assures that the methods for TaskService work properly
 */

package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import taskService.Task;
import taskService.TaskService;

class TaskServiceTest {

	@Test
	void testAddTask() { // testing add function
		TaskService ts = new TaskService();
		Task test1 = new Task("1234567891", "Name", "Description"); // add new task
		assertTrue(ts.addTask(test1));
	}
	
	@Test
	void testDelete() { // Testing delete function
		TaskService ts = new TaskService();
		Task test1 = new Task("1234567891", "Name", "Description");
		Task test2 = new Task("1234567892", "Link", "Defeat Ganondorf and save Zelda!");

		ts.addTask(test1);
		ts.addTask(test2);
		
		assertTrue(ts.deleteTask("1234567891")); // testing to delete test1
		assertFalse(ts.deleteTask("1234567893")); // testing to delete non-existant test
		assertFalse(ts.deleteTask("1234567891")); // testing to delete already deleted test
	}
	
	@Test // Testing the update function
	void testUpdate() {
		TaskService ts = new TaskService();
		
		// create task and add to array for testing
		Task test1 = new Task("1234567892", "Link", "Defeat Ganondorf and save Zelda!");
		
		ts.addTask(test1);
		
		// update task with new name and description
		assertTrue(ts.updateTask("1234567892", "Zelda", "Help Link gain the power of the triforce!"));
	}

}
