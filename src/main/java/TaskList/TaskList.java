package TaskList;
import Task.Task;

public class TaskList {
    private Task head;
    private Task tail;
    public int size;

    public Task createTaskList(String description){
        head = new Task(description);
        Task task = new Task(description);
        task.next = null;
        head = task;
        tail = task;
        size = 1;
        return head;
    }

    public void insertInTaskList(String description, int location){
        Task task = new Task(description);
        if (head == null){
            createTaskList(description);
            return;
        } else if (location == 0) {
            task.next = head;
            head = task;
        } else if (location >= size) {
            tail.next = task;
            task.next = null;
            tail = task;
        } else {
            Task tempTask = head;
            int index = 0;
            while (index < location - 1) {
                tempTask = tempTask.next;
                index++;
            }
            Task nextNode = tempTask.next;
            task.next = nextNode;
            tempTask.next = task;
        }
        size++;

    }

    public void traverseTaskList(){
        if (head == null) {
            System.out.println("Linked list does not exist");
        } else {
            Task tempTask = head;
            for (int i = 0; i < size; i++){
                if(tempTask.isCompleted()) {
                    System.out.print(tempTask.getDescript() + " completion statues: completed" );
                }

                else {
                    System.out.print(tempTask.getDescript() + " completion statues: pending" );

                }
                if (i !=size -1 ){
                    System.out.print(" -> ");
                }
                tempTask = tempTask.next;
            }
        }
        System.out.print("\n");
    }

    public Task searchNode(String description) {
        if (head != null){
            Task tempTask = head;
            for (int i = 0; i < size; i++){
                if (tempTask.getDescript().equals(description)){
                    return tempTask;
                }
                tempTask = tempTask.next;
            }
        }

        return null;
    }

    public void completeTask(String description){
        Task task = searchNode(description);

        if(task == null){
            System.out.println("Task does not exist");
        }

        else{
            task.completeTask();
        }
    }


}
