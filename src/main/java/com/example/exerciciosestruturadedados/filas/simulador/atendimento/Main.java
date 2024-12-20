package com.example.exerciciosestruturadedados.filas.simulador.atendimento;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BankQueue queue = new BankQueue();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Enqueue Customer");
            System.out.println("2. Dequeue Customer");
            System.out.println("3. Print Queue");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            if (!scanner.hasNextInt()) {
                System.out.println("Invalid input! Please enter a number.");
                scanner.nextLine(); // Limpa a entrada incorreta
                continue;
            }

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consome a nova linha

            switch (choice) {
                case 1:
                    System.out.print("Enter customer name: ");
                    String name = scanner.nextLine();
                    queue.enqueue(name);
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





