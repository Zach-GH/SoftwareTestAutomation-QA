/*
 * Zachary Meisner
 * 5/28/22
 * CS-320-T5614
 * Task class creates an object with variables that have specified formats that is called by TaskService.
 */

package taskService;

public class Task {

	private String taskId;
	private String name;
	private String description;
	
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
	
	public String getName() {
		return name;
	}
	
	public String getDescription() {
		return description;
	}
	
	// setters
	
	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	@Override
	public String toString() {
		return "Task: Id = " + taskId + ", Name = " + name +
				", Description = " + description;
	}
	
}
