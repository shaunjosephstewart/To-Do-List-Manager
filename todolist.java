{\rtf1\ansi\ansicpg1252\cocoartf2709
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\margl1440\margr1440\vieww33400\viewh17940\viewkind0
\pard\tx720\tx1440\tx2160\tx2880\tx3600\tx4320\tx5040\tx5760\tx6480\tx7200\tx7920\tx8640\pardirnatural\partightenfactor0

\f0\fs24 \cf0 import java.util.ArrayList;\
import java.util.Scanner;\
\
public class TodoListManager \{\
    // Declare lists to hold pending and completed tasks\
    private static ArrayList<String> taskList = new ArrayList<>();\
    private static ArrayList<String> completedTasks = new ArrayList<>();\
    private static Scanner input = new Scanner(System.in);\
\
    public static void main(String[] args) \{\
        // Declare variables for user input\
        String userInput;\
\
        // Main program loop\
        do \{\
            // Display menu options\
            System.out.println("Choose an option:");\
            System.out.println("1. Add a task");\
            System.out.println("2. Mark a task as complete");\
            System.out.println("3. View tasks");\
            System.out.println("4. Exit");\
\
            // Get user choice\
            userInput = input.nextLine();\
\
            // Execute corresponding action based on user input\
            if (userInput.equals("1")) \{\
                addTask();  // Call method to add a new task\
            \} else if (userInput.equals("2")) \{\
                markTaskComplete();  // Call method to mark task as complete\
            \} else if (userInput.equals("3")) \{\
                viewTasks();  // Call method to view all tasks\
            \} else if (!userInput.equals("4")) \{\
                System.out.println("Invalid option. Try again.");  // Handle invalid input\
            \}\
\
        \} while (!userInput.equals("4"));  // Continue until user selects "Exit"\
\
        System.out.println("Exiting program...");\
    \}\
\
    // Method to add a task to the pending task list\
    public static void addTask() \{\
        System.out.println("Enter the task to add: ");\
        String taskName = input.nextLine();  // Get task name from user\
\
        // Validate input to ensure it's a valid task name\
        if (taskName.matches("[a-zA-Z\\\\s]+")) \{  // Only alphabetic characters and spaces allowed\
            taskList.add(taskName);  // Add task to pending list\
            System.out.println("Task added successfully: " + taskName);\
        \} else \{\
            System.out.println("Invalid task name. Please enter a valid task.");\
        \}\
    \}\
\
    // Method to mark a task as complete and move it to the completed list\
    public static void markTaskComplete() \{\
        System.out.println("Enter the task to mark as complete: ");\
        String taskToComplete = input.nextLine();  // Get task name to mark as complete\
\
        // Check if the task exists in the pending list\
        if (taskList.contains(taskToComplete)) \{\
            taskList.remove(taskToComplete);  // Remove task from pending list\
            completedTasks.add(taskToComplete);  // Add task to completed tasks list\
            System.out.println("Task marked as complete: " + taskToComplete);\
        \} else \{\
            System.out.println("Task not found.");\
        \}\
    \}\
\
    // Method to display the list of tasks\
    public static void viewTasks() \{\
        // Display pending tasks\
        System.out.println("Pending tasks:");\
        for (String task : taskList) \{\
            System.out.println("- " + task);\
        \}\
\
        // Display completed tasks\
        System.out.println("Completed tasks:");\
        for (String task : completedTasks) \{\
            System.out.println("- " + task);\
        \}\
    \}\
\}\
}