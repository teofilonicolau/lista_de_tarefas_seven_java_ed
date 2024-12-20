package com.example.exerciciosestruturadedados.filas.gerenciamento.impressoes;




public class PrintQueue {
    private PrintJob front;
    private PrintJob rear;

    public void enqueue(String documentName) {
        PrintJob newJob = new PrintJob(documentName);
        if (rear == null) {
            front = newJob;
            rear = newJob;
        } else {
            rear.setNext(newJob);
            rear = newJob;
        }
    }

    public String dequeue() {
        if (front == null) {
            return "Queue is empty";
        }
        String documentName = front.getDocumentName();
        front = front.getNext();
        if (front == null) {
            rear = null;
        }
        return "Printing: " + documentName;
    }

    public void printQueue() {
        PrintJob temp = front;
        while (temp != null) {
            System.out.print(temp.getDocumentName() + " ");
            temp = temp.getNext();
        }
        System.out.println();
    }
}
