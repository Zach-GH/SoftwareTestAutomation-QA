/*
 * Zachary Meisner
 * 5/28/22
 * CS-320-T5614
 * TaskService creates an ArrayList, 
 * and creates objects using the Task Class
 * Allowing us to add, delete, or update corresponding objects in the Data Structure.
 */

package taskService;

import java.util.ArrayList;

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
				taskList.setName(name);
				taskList.setDescription(description);
			}
			return true;
		}
	
		return false;
	}

}
