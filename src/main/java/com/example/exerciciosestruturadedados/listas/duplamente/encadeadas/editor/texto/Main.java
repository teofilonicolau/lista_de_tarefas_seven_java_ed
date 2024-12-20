package com.example.exerciciosestruturadedados.listas.duplamente.encadeadas.editor.texto;




import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Add Text");
            System.out.println("2. Undo Last Action");
            System.out.println("3. Redo Last Action");
            System.out.println("4. Print Text");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter text: ");
                    String text = scanner.nextLine();
                    editor.addText(text);
                    break;
                case 2:
                    editor.undo();
                    break;
                case 3:
                    System.out.print("Enter text for redo: ");
                    text = scanner.nextLine();
                    editor.redo(text);
                    break;
                case 4:
                    editor.printText();
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
