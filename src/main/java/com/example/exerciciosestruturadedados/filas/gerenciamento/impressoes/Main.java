package com.example.exerciciosestruturadedados.filas.gerenciamento.impressoes;



import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PrintQueue queue = new PrintQueue();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Add Print Job");
            System.out.println("2. Process Print Job");
            System.out.println("3. Print Queue");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter document name: ");
                    String documentName = scanner.nextLine();
                    queue.enqueue(documentName);
                    break;
                case 2:
                    System.out.println(queue.dequeue());
                    break;
                case 3:
                    queue.printQueue();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
