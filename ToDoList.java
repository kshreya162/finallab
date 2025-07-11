import java.util.ArrayList;
import java.util.List;


public class ToDoList {
    private List<ToDoItem> items; //list to hold the todo items
    private int nextId; // to keep track of next available id

    //constructor
    public ToDoList(){
        items= new ArrayList<>(); //initialise the list
        nextId = 1; //start from 1
    }

    //method to add new task
    public void addTask(String task){
        ToDoItem newItem=new ToDoItem(nextId++,task);
        items.add(newItem);
        System.out.println("Task added : " + task);
    }

    //
    public void removeTask(int id){
        items.removeIf(item -> item.getId() == id);
        System.out.println("Task removed with ID : " + id);
    }

    // Method to mark a task as completed
    public void markCompleted(int id) {
        for (ToDoItem item : items) {
            if (item.getId() == id) {
                item.markCompleted(); // Mark the task as completed
                System.out.println("Task marked as completed: " + item.getTask());
                return;
            }
        }
    }

    public void displayTasks() {
                    if (items.isEmpty()) {
                        System.out.println("No tasks available."); // If no tasks, print a message
                        return;
                    }
                    System.out.println("Current Tasks:");
                    for (ToDoItem item : items) {
                        System.out.println(item); // Print each task using the toString method of ToDoItem
                    }
                }



}
