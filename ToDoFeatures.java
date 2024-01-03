import java.util.ArrayList;
import java.util.Scanner;

public class ToDoFeatures {
    private ArrayList<String> tasks;

    public ToDoFeatures() {
        this.tasks = new ArrayList<>();
    }

    public void addTask(String task) {
        tasks.add(task);
        System.out.println("Task added: " + task);
    }

    public void removeTask(int index) {
        if (index >= 0 && index < tasks.size()) {
            String removedTask = tasks.remove(index);
            System.out.println("Task removed: " + removedTask);
        } else {
            System.out.println("Invalid index. Task not removed.");
        }
    }

    public void displayTasks() {
        System.out.println("Todo List:");
        for (int i = 0; i < tasks.size(); i++) {
            System.out.println((i + 1) + ". " + tasks.get(i));
        }
    }

    
    public static void main(String[] args) {
        ToDoFeatures todoList = new ToDoFeatures();
        Scanner scanner = new Scanner(System.in);

        int choice;

        do {
            System.out.println("\nTodo List Menu:");
            System.out.println("press 1 to Add Task");
            System.out.println("press 2 to Remove Task");
            System.out.println("press 3 to Display Tasks");
            System.out.println("press 0 to Exit");
            System.out.print("Enter your choice: ");
            
            choice = scanner.nextInt();
            scanner.nextLine(); 
            
            switch (choice) {
                case 1:
                    System.out.print("Enter task to add: ");
                    String taskToAdd = scanner.nextLine();
                    todoList.addTask(taskToAdd);
                    break;
                case 2:
                    System.out.print("Enter index of task to remove: ");
                    int indexToRemove = scanner.nextInt();
                    todoList.removeTask(indexToRemove - 1); // Adjust index to 0-based
                    break;
                case 3:
                    todoList.displayTasks();
                    break;
                case 0:
                    System.out.println("Thank You, /\\ r a d h y a");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 0);

        scanner.close();
    }
}

