package com.example.exerciciosestruturadedados.listas.duplamente.encadeadas.jogo.cartas;




import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PlayerHand hand = new PlayerHand();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Add Card");
            System.out.println("2. Remove Card");
            System.out.println("3. Print Hand");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter card value: ");
                    String value = scanner.nextLine();
                    hand.addCard(value);
                    break;
                case 2:
                    System.out.print("Enter card value to remove: ");
                    value = scanner.nextLine();
                    hand.removeCard(value);
                    break;
                case 3:
                    hand.printHand();
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

