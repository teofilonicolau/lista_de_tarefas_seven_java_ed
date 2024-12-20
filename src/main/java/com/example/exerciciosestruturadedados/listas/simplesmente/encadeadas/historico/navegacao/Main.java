package com.example.exerciciosestruturadedados.listas.simplesmente.encadeadas.historico.navegacao;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BrowsingHistory history = new BrowsingHistory(5); // Maximum history size

        while (true) {
            System.out.println("1. Visit URL");
            System.out.println("2. Print History");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter URL: ");
                    String url = scanner.nextLine();
                    history.visitUrl(url);
                    break;
                case 2:
                    history.printHistory();
                    break;
                case 3:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
