package com.example.exerciciosestruturadedados.filas.fila.processos;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ProcessQueue queue = new ProcessQueue();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Add Process");
            System.out.println("2. Execute Process");
            System.out.println("3. Print Queue");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            try {
                if (!scanner.hasNextInt()) {
                    System.out.println("Please enter a valid number.");
                    scanner.next(); // Descartar a entrada inválida
                    continue;
                }

                int choice = scanner.nextInt();
                scanner.nextLine(); // Consumir a nova linha

                switch (choice) {
                    case 1:
                        System.out.print("Enter process name: ");
                        String processName = scanner.nextLine();
                        queue.enqueue(processName);
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
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.nextLine(); // Limpar a entrada inválida
            }
        }
    }
}
