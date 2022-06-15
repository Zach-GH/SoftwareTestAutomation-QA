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
 * TaskService uses an ArrayList to add functionality for adding, Updating, and deleting objects
 */

package taskService;

import java.util.ArrayList;

import dataFactory.TaskBuilder;

public class TaskService {
	
	private ArrayList<Task> tasks;
	
	public TaskService() {
		
		// create array list for objects
		tasks = new ArrayList<>();
	}
	// add tasks with unique ID
	public boolean addTask(Task task) {
		boolean taskExists = false;
		// loop through tasks in list, if no task in list then add task
		for (Task taskList:tasks) {
			if (taskList.equals(task)) {
				taskExists = true;
			}
		}
		if (!taskExists) {
			tasks.add(task);
			return true;
		}
		else {
			return false;
		}
	}
	
	// delete tasks using ID number
	public boolean deleteTask(String string) {
		for(Task taskList:tasks) {
			if (taskList.getTaskId().equals(string)) {
				tasks.remove(taskList);
				return true;
			}
		}
		return false;
	}
	
	// update tasks using ID number
	public boolean updateTask(String taskId, String name, String description) {
		for (Task taskList:tasks) {
			if(taskList.getTaskId().equals(taskId)) {
				tasks.remove(taskList);
				Task updatedTask = new TaskBuilder().
						taskId(taskId).
						name("name").
						description("description").
						build();
				tasks.add(updatedTask);
			}
			return true;
		}
	
		return false;
	}

}
