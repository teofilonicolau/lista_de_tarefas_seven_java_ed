package com.example.exerciciosestruturadedados.listas.duplamente.encadeadas.editor.texto;


public class TextEditor {
    private TextNode head;
    private TextNode current;

    public TextEditor() {
        head = null;
        current = null;
    }

    public void addText(String text) {
        TextNode newNode = new TextNode(text);
        if (head == null) {
            head = newNode;
            current = newNode;
        } else {
            current.setNext(newNode);
            newNode.setPrev(current);
            current = newNode;
        }
    }

    public void undo() {
        if (current != null) {
            current = current.getPrev();
            if (current != null) {
                current.setNext(null);
            }
        }
    }

    public void redo(String text) {
        if (current != null && current.getNext() == null) {
            addText(text);
        }
    }

    public void printText() {
        TextNode temp = head;
        while (temp != null) {
            System.out.print(temp.getText() + " ");
            temp = temp.getNext();
        }
        System.out.println();
    }
}
