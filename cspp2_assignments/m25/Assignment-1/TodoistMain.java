import java.util.Scanner;
import java.util.Arrays;
import java.util.*;
/**
  * write your code below this comment
  */
class Task {
	String title;
	String assignedTo;
	int timeToComplete;
	boolean important;
	boolean urgent;
	String status;
    String ifimp;
    String ifurgnt;

	Task(String title, String assignedTo, int timeToComplete, boolean important, boolean urgent, String status) {
		this.title = title;
		this.assignedTo = assignedTo;
		this.timeToComplete = timeToComplete;
		this.important = important;
		this.urgent = urgent;
		this.status = status;

		
		// throws Exception {
		// 	title = "null"; 
		
		// }

		// catch {
		// 	System.out.println("Title not provided");

		// }

		// throws Exception() {
		// 	timeToComplete < 0;
		// }
		// }

		// catch() {
		// 	System.out.println("Invalid timeToComplete", + timevalue);
		// }

		// throws Exception {
		// 	status(todo == done);
		// 	System.out.println("Invalid sring");

		}
	public String toString() {
		if (important) {
            ifimp = "important";


        } else {
            ifimp = "Not important";

        }
        if (urgent) {
            ifurgnt = "Urgent";

        } else {
            ifurgnt = "Not urgent";
        }

        return title + ", " + assignedTo + ", " + timeToComplete + ", " + ifimp + ", " + ifurgnt + ", " + status;
	}
    public void getNextTask(String name, int taskcount) {

    }
}

class Todoist {
    Todoist() {

    }
    void totalTime4Completion() {

    }
    public void getNextTask(String task, int x) {

    }

    public void addTask(Task[] taskobj) {
        // Task[] taskobjs = new Task();
        // task++;
    }

    // public void resize() {
    //     set = java.util.Arrays.copyOf(set, size * 2);
    // }
}



/**
 * Class for todoist main.
 */
public class TodoistMain {

    /**
     * Starts a test.
     */
    public static void startTest() {
        Todoist todo = new Todoist();
        Scanner s = new Scanner(System.in);
        while (s.hasNext()) {
            String[] tokens = s.nextLine().split(",");
            switch (tokens[0]) {
                case "task":
                    testTask(tokens);
                break;
                case "add-task":
                    testAddTask(todo, tokens);
                break;
                case "print-todoist":
                    System.out.println(todo);
                break;
                case "get-next":
                    // System.out.println(todo.getNextTask(tokens[1]));
                break;
                case "get-next-n":
                    // int n = Integer.parseInt(tokens[2]);
                    // Task[] tasks = todo.getNextTask(tokens[1], n);
                    // System.out.println(Arrays.deepToString(tasks));
                break;
                case "total-time":
                    // System.out.println(todo.totalTime4Completion());
                break;
                default:
                break;
            }
        }
    }

    /**
     * method to test add task.
     *
     * @param      todo    The todo
     * @param      tokens  The tokens
     */
    public static void testAddTask(final Todoist todo, final String[] tokens) {
        try {
            // todo.addTask(createTask(tokens));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * method to test the creation of task object.
     *
     * @param      tokens  The tokens
     */
    public static void testTask(final String[] tokens) {
        try {
            // System.out.println(createTask(tokens));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * Creates a task object.
     *
     * @param      tokens     The tokens
     *
     * @return     Task object
     *
     * @throws     Exception  if task inputs are invalid
     */
    public static Task createTask(final String[] tokens) throws Exception {
        String title = tokens[1];
        String assignedTo = tokens[2];
        int timeToComplete = Integer.parseInt(tokens[3]);
        boolean important = tokens[4].equals("y");
        boolean urgent = tokens[5].equals("y");
        String status = tokens[6];
        return new Task(
            title, assignedTo, timeToComplete, important, urgent, status);
    }

    /**
     * main method.
     *
     * @param      args  The command line arguments
     */
    public static void main(final String[] args) {
        startTest();
    }
}
