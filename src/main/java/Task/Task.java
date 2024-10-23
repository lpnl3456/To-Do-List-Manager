package Task;

public class Task {

    private String descript;
    private boolean completed;
    public Task next;

    public Task(String descript) {
        this.descript = descript;
        completed = false;
    }

    public String getDescript() {
        return descript;
    }

    public void setDescript(String descript) {
        this.descript = descript;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    public Task getNext() {
        return next;
    }

    public void setNext(Task next) {
        this.next = next;
    }


    public void completeTask(){
        if(!completed){
            completed = true;
            System.out.println("This task is now completed");
        }

        else{
            System.out.println("This task is already completed");
        }
    }
}
