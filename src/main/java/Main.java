import java.util.Objects;
import java.util.Scanner;
import User.User;

public class Main {


    static User[] users = new User [6];
    static Scanner in = new Scanner(System.in);
    public static void addUser(){
        System.out.println("Enter the User's first name: ");
        String firstName = in.next();

        System.out.println("Enter the User's last name: ");
        String lastName = in.next();

        for(int i = 0; i<users.length;i++){
            if(users[i] == null){
                users[i] = new User(firstName, lastName);
                System.out.println("User had been created and edded to the array");
                return;
            }
        }

        System.out.println("Array is full");


    }

    public static void login(){
        User user;

        System.out.println("Enter the users's Name");
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

    public static void userMenu(User user){
        boolean quitMenu = false;

        while (!quitMenu) {
            String option = "";

            System.out.println("Select which option you wish to use");
            System.out.println("1.Add Task\n2.Complete Task\n3.quit");
            option = in.next();

            switch(option) {
                case "1":
                    System.out.println("Add task");
                    break;
                case "2":
                    System.out.println("Complete task");
                    break;
                case "3":
                    quitMenu = true;
                    break;
                default:
                    System.out.println("Invalid input-Please re-enter");
                    break;
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
