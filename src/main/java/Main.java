import java.util.Objects;
import java.util.Scanner;
import User.User;

public class Main {


    static User[] users = new User [6];
    static Scanner in = new Scanner(System.in);

    //Method to create a User object and add it to the array
    public static void addUser(){


        System.out.println("Enter the User's first name: ");
        String firstName = in.next();

        System.out.println("Enter the User's last name: ");
        String lastName = in.next();

        //Add User to array if the array is not full
        for(int i = 0; i<users.length;i++){
            if(users[i] == null){
                users[i] = new User(firstName, lastName);
                System.out.println("User had been created and added to the array");
                return;
            }
        }

        System.out.println("Array is full");


    }

    //Method to login in using a User's last name
    public static void login(){
        User user;

        System.out.println("Enter the user's last name");
        String lastName = in.next();

        for(int i = 0; i<users.length; i++){

            if(users[i] ==null){
                return;
            }
             user = users[i];
            System.out.println(user.getLastName());

             if(lastName.equals(user.getLastName())){

                 System.out.println("Enter if statement");
                userMenu(user);
             }
        }
    }

    //Method to display Task menu
    public static void userMenu(User user){
        boolean quitMenu = false;

        while (!quitMenu) {
            String option = "";

            System.out.println("Select which option you wish to use");
            System.out.println("1.Add Task\n2.Complete Task\n3.See tasks\n4.quit");
            option = in.next();

            switch(option) {
                case "1":
                    addTask(user);
                    break;
                case "2":
                    completeTask(user);
                    break;
                case "3":
                    user.getTaskList().traverseTaskList();
                    break;
                case "4":
                    quitMenu = true;
                    break;
                default:
                    System.out.println("Invalid input-Please re-enter");
                    break;
            }

        }

        }

        //Method to add a task to list
        public static void addTask(User user){
        String descript = "";
        int placement;
        boolean valid = false;

        while (!valid){
            in.nextLine();
            System.out.println("Enter the description of the task");

            descript = in.nextLine();

            if(descript.isEmpty()){
                System.out.println("Description must have a value- Please re-enter");
                }

            else{
                valid = true;
            }
        }

        valid = false;

            while(!valid){
                System.out.println("Enter the where the task is to be placed");

                try{
                    placement = in.nextInt();
                    user.getTaskList().insertInTaskList(descript,placement);
                    valid = true;
                }
                catch(Exception e){
                    System.out.println("Placement must be a number-Please re-enter");
                }
            }

        }

        //Method to complete task
public static void completeTask(User user){
        boolean quit = false;
        String taskDescript;
        in.nextLine();
        while(!quit){
            user.getTaskList().traverseTaskList();

            System.out.println("Enter the description of the class you wish to complete or enter 1 to quit");{
            taskDescript = in.nextLine();

            if(taskDescript.equals("1")){
                return;
            }

            user.completeTask(taskDescript);

            }
        }

}


    public static void main(String[] args) {
    boolean quit = false;

    while (!quit){
        String option = "";

        System.out.println("Select which option you wish to use");
        System.out.println("1.Add User\n2.Login\n3.quit");
        option = in.next();

        switch(option) {
            case "1":
                addUser();
                break;

            case "2":
                login();
                break;
            case "3":
                System.out.println("Thank you for using the program");
                quit = true;
                break;
            default:
                System.out.println("Invalid input- Please re-enter");
                break;
        }
    }


    }
}
