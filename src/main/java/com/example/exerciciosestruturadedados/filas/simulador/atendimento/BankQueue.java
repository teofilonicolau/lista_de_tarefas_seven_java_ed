package com.example.exerciciosestruturadedados.filas.simulador.atendimento;



public class BankQueue {
    private Customer front;
    private Customer rear;

    public void enqueue(String name) {
        Customer newCustomer = new Customer(name);
        if (rear == null) {
            front = newCustomer;
            rear = newCustomer;
        } else {
            rear.setNext(newCustomer);
            rear = newCustomer;
        }
    }

    public String dequeue() {
        if (front == null) {
            return "Queue is empty";
        }
        String name = front.getName();
        front = front.getNext();
        if (front == null) {
            rear = null;
        }
        return "Customer " + name + " is being served";
    }

    public void printQueue() {
        Customer temp = front;
        while (temp != null) {
            System.out.print(temp.getName() + " ");
            temp = temp.getNext();
        }
        System.out.println();
    }
}
