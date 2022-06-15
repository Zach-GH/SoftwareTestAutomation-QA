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
 * Builder class initializes variables to build an Task object for testing and updating objects
 */

package dataFactory;

import taskService.Task;

public class TaskBuilder {

	private String taskId;
	private String name;
	private String description;
	
	public TaskBuilder taskId(String taskId) {
		this.taskId = taskId;
		return this;
	}
	
	public TaskBuilder name(String name) {
		this.name = name;
		return this;
	}
	
	public TaskBuilder description(String description) {
		this.description = description;
		return this;
	}
	
	public Task build() {
		return new Task(taskId, name, description);
	}
}
