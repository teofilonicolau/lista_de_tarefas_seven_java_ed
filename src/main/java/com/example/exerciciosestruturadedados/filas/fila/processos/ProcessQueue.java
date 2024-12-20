package com.example.exerciciosestruturadedados.filas.fila.processos;




public class ProcessQueue {
    private Process front;
    private Process rear;

    public void enqueue(String processName) {
        Process newProcess = new Process(processName);
        if (rear == null) {
            front = newProcess;
            rear = newProcess;
        } else {
            rear.setNext(newProcess);
            rear = newProcess;
        }
    }

    public String dequeue() {
        if (front == null) {
            return "Queue is empty";
        }
        String processName = front.getProcessName();
        front = front.getNext();
        if (front == null) {
            rear = null;
        }
        return "Executing: " + processName;
    }

    public void printQueue() {
        Process temp = front;
        while (temp != null) {
            System.out.print(temp.getProcessName() + " ");
            temp = temp.getNext();
        }
        System.out.println();
    }
}
