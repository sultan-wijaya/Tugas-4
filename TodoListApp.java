import java.util.ArrayList;
import java.util.Scanner;


public class TodoListApp {
    private ArrayList<String> todoList;

    // Constructor to initialize the ArrayList
    public TodoListApp() {
        todoList = new ArrayList<>();
    }

    // Method to add a task
    public void addTask(String task) {
        todoList.add(task);

    }

    // Method to remove by task name
    public void removeTaskByName(String task) {
        if (todoList.remove(task)) {
            System.out.println("Task removed " + task);
        } 
    }
    // Method to remove by task index
    public void removeTaskByIndex(int index) {
        if (index >= 0 && index < todoList.size()) {
            String removedTask = todoList.remove(index);
            System.out.println("Task removed " + removedTask);
        } else {
            System.out.println("Invalid index");
        }
    }
    //Method to search by task name
    public void searchTask(String task) {
        if (todoList.contains(task)) {
            System.out.println("Task found : " + task);
        } else {
            System.out.println("Task not found");
        }
    }

    // Method to display all tasks
    public void displayTasks() {
        if (todoList.isEmpty()) {
            System.out.println("No task available");
        } else {
        // show all task
        System.out.println("Your todo List");
        // create looping
        for (int i = 0; i < todoList.size(); i++) {
            System.out.println(i + "." + todoList.get(i));
        }
    }

    }


    public static void main(String[] args) {
        TodoListApp app = new TodoListApp();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\nTo-Do List Application");
            System.out.println("1. Add Task");
            //Remove Task By Task Name
            //Remove Task By Task Index
            //Search Task By Task Name
            System.out.println("2. Remove Task by Name");
            System.out.println("3. Remove Task by Index");
            System.out.println("4. Search Task by Name");
            System.out.println("5. Display Tasks");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter task to add: ");
                    String taskToAdd = scanner.nextLine();
                    app.addTask(taskToAdd);

                    break;

                case 2:
                    System.out.print("Enter task to remove: ");
                    String taskToRemove = scanner.nextLine();
                    app.removeTaskByName(taskToRemove);

                    break;
                    case 3:
                    System.out.print("Enter task index to remove: ");
                    int indexToRemove = scanner.nextInt();
                    app.removeTaskByIndex(indexToRemove);
                    break;
                    case 4:
                    System.out.print("Enter task name to search: ");
                    String taskToSearch = scanner.nextLine();
                    app.searchTask(taskToSearch);
                    break;
                case 5:
                    app.displayTasks();
                    break;
                case 6:
                    System.out.println("Exiting the application...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
    }
}
