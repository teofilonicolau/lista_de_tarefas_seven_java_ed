package com.example.exerciciosestruturadedados.listas.simplesmente.encadeadas.controle.reversao;



public class ActionHistory {
    private Action head;

    public void addAction(String description) {
        Action newAction = new Action(description);
        if (head == null) {
            head = newAction;
        } else {
            Action temp = head;
            while (temp.getNext() != null) {
                temp = temp.getNext();
            }
            temp.setNext(newAction);
        }
    }

    public String undoAction() {
        if (head == null) return "No actions to undo";

        if (head.getNext() == null) {
            String description = head.getDescription();
            head = null;
            return "Undo: " + description;
        }

        Action temp = head;
        while (temp.getNext().getNext() != null) {
            temp = temp.getNext();
        }

        String description = temp.getNext().getDescription();
        temp.setNext(null);
        return "Undo: " + description;
    }

    public void printHistory() {
        Action temp = head;
        while (temp != null) {
            System.out.println(temp.getDescription());
            temp = temp.getNext();
        }
    }
}
