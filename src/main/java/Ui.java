import java.util.Scanner;
import java.util.ArrayList;

/**
 * Represents a user interface that deals with the interaction between the user and computer.
 */
public class Ui {

    private Scanner sc;

    public Ui() {
        sc = new Scanner(System.in);
    }

    public String getNextLine() {
        return sc.nextLine();
    }

    public String getNext() {
        return sc.next();
    }

    public void printLine() {
        System.out.println("    _____________________________________");
    }

    public void printHello() {
        printLine();
        System.out.println("     Hello! I'm Duke\n     What can I do for you?");
        printLine();
    }

    public void printBye() {
        printLine();
        System.out.println("     Bye. Hope to see you again soon!");
        printLine();
    }

    public void printAddTask(TaskList taskList, Task newTask) {
        printLine();
        System.out.println("     Got it. I've added this task:");
        System.out.println("       " + newTask);
        System.out.println("     Now you have " + taskList.getListOfTasks().size() + " tasks in the list.");
        System.out.println("    _____________________________________\n");
    }

    public void printTaskList(TaskList taskList) {
        printLine();
        System.out.println("     Here are the tasks in your list:");
        for (int i = 0; i < taskList.getListOfTasks().size(); i++) {
            int number = i + 1;
            System.out.println("     " + number + "." + taskList.getListOfTasks().get(i));
        }
        System.out.println("    _____________________________________\n");
    }

    public void printDoneTask(TaskList taskList, int taskNumber) {
        printLine();
        System.out.println("     Nice! I've marked this task as done:");
        System.out.println("       " + taskList.getListOfTasks().get(taskNumber));
        System.out.println("    _____________________________________\n");
    }

    public void printDeleteTask(TaskList taskList, Task deletedTask) {
        printLine();
        System.out.println("     Noted. I've removed this task:");
        System.out.println("       " + deletedTask);
        System.out.println("     Now you have " +  taskList.getListOfTasks().size() + " tasks in the list.");
        System.out.println("    _____________________________________\n");
    }

    public void printFindTasks(ArrayList<Task> listOfTasks) {
        printLine();
        System.out.println("     Here are the matching tasks in your list:");
        for (int i = 0; i < listOfTasks.size(); i++) {
            int number = i + 1;
            System.out.println("     " + number + "." + listOfTasks.get(i));
        }
        System.out.println("     _____________________________________\n");
    }
}