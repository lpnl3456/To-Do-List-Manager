package User;

import TaskList.TaskList;

public class User {

    private String fistName;
    private String lastName;
    private TaskList taskList = new TaskList();

    public User(String fistName, String lastName) {
        this.fistName = fistName;
        this.lastName = lastName;
    }

    public String getFistName() {
        return fistName;
    }

    public void setFistName(String fistName) {
        this.fistName = fistName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public TaskList getTaskList() {
        return taskList;
    }

    public void setTaskList(TaskList taskList) {
        this.taskList = taskList;
    }

    public void addTask(String description, int location){
        taskList.insertInTaskList(description, location);
    }

    public void seeTasks(){
        taskList.traverseTaskList();
    }

    public void completeTask(String description){
        taskList.completeTask(description);
    }
}
