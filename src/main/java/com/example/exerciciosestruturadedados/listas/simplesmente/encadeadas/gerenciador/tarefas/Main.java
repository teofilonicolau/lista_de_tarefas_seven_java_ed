package com.example.exerciciosestruturadedados.listas.simplesmente.encadeadas.gerenciador.tarefas;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TaskManager taskManager = new TaskManager();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Add Task");
            System.out.println("2. Remove Task");
            System.out.println("3. Mark Task Completed");
            System.out.println("4. Print Tasks");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter task description: ");
                    String description = scanner.nextLine();
                    taskManager.addTask(description);
                    break;
                case 2:
                    System.out.print("Enter task description to remove: ");
                    description = scanner.nextLine();
                    taskManager.removeTask(description);
                    break;
                case 3:
                    System.out.print("Enter task description to mark as completed: ");
                    description = scanner.nextLine();
                    taskManager.markTaskCompleted(description);
                    break;
                case 4:
                    taskManager.printTasks();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}

