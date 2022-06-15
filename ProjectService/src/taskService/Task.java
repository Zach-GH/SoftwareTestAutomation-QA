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
 * Task class initializes variables for object and sets parameters of what they can and cannot be
 */

package taskService;

public class Task {

	final private String taskId;
	final private String name;
	final private String description;
	
	public Task(String taskId, String name, String description) {
		
		super();
		
		// taskId cannot be null or longer than 10 characters
		if(taskId == null || taskId.length() > 10) {
			throw new IllegalArgumentException("Invalid Id");
		}
		
		// name cannot be null or longer than 20 characters
		if(name == null || name.length() > 20) {
			throw new IllegalArgumentException("Invalid Name");
		}
		
		// Description cannot be null or longer than 50 characters
		if(description == null || description.length() > 50) {
			throw new IllegalArgumentException("Invalid Description");
		}
		
		this.taskId = taskId;
		this.name = name;
		this.description = description;
	}
	
	// getters
	
	public String getTaskId() {
		return taskId;
	}
	
	
	@Override
	public String toString() {
		return "Task: Id = " + taskId + ", Name = " + name +
				", Description = " + description;
	}
	
}
