package com.example.exerciciosestruturadedados.listas.simplesmente.encadeadas.controle.reversao;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ActionHistory history = new ActionHistory();

        while (true) {
            System.out.println("1. Add Action");
            System.out.println("2. Undo Last Action");
            System.out.println("3. Print History");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter action description: ");
                    String description = scanner.nextLine();
                    history.addAction(description);
                    break;
                case 2:
                    System.out.println(history.undoAction());
                    break;
                case 3:
                    history.printHistory();
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
