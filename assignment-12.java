import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

// Custom Exception for Invalid Tasks
class InvalidTaskException extends Exception {
    public InvalidTaskException(String message) {
        super(message);
    }
}

// TaskManager class
class TaskManager {
    private ArrayList<String> tasksArray;
    private LinkedList<String> tasksLinked;

    // Constructor
    public TaskManager() {
        tasksArray = new ArrayList<>();
        tasksLinked = new LinkedList<>();
    }

    // Add task
    public void addTask(String task) throws InvalidTaskException {
        if (task == null || task.trim().isEmpty()) {
            throw new InvalidTaskException("Invalid task! Cannot add empty task.");
        }
        tasksArray.add(task);
        tasksLinked.add(task);
        System.out.println("Task added: " + task);
    }

    // Remove task
    public void removeTask(String task) {
        if (tasksArray.remove(task) && tasksLinked.remove(task)) {
            System.out.println("Task removed: " + task);
        } else {
            System.out.println("Task not found: " + task);
        }
    }

    // Sort tasks alphabetically
    public void sortTasks() {
        Collections.sort(tasksArray);
        Collections.sort(tasksLinked);
        System.out.println("Tasks sorted alphabetically.");
    }

    // Search for a task
    public int searchTask(String task) {
        int index = tasksArray.indexOf(task);
        if (index != -1) {
            System.out.println("Task found at index: " + index);
        } else {
            System.out.println("Task not found: " + task);
        }
        return index;
    }

    // Find the longest task
    public String findLongestTask() {
        if (tasksArray.isEmpty()) return "No tasks available.";
        String longest = tasksArray.get(0);
        for (String t : tasksArray) {
            if (t.length() > longest.length()) longest = t;
        }
        return longest;
    }

    // Retrieve task by index
    public String getTaskByIndex(int index) {
        try {
            return tasksArray.get(index);
        } catch (IndexOutOfBoundsException e) {
            return "Error: Index " + index + " is out of bounds!";
        }
    }

    // Display all tasks
    public void displayTasks() {
        System.out.println("Tasks in ArrayList: " + tasksArray);
        System.out.println("Tasks in LinkedList: " + tasksLinked);
    }
}
