package com.example.exerciciosestruturadedados.listas.simplesmente.encadeadas.gerenciador.tarefas;



public class TaskManager {
    private Task head;

    public void addTask(String description) {
        Task newTask = new Task(description);
        if (head == null) {
            head = newTask;
        } else {
            Task temp = head;
            while (temp.getNext() != null) {
                temp = temp.getNext();
            }
            temp.setNext(newTask);
        }
    }

    public void removeTask(String description) {
        if (head == null) return;

        if (head.getDescription().equals(description)) {
            head = head.getNext();
            return;
        }

        Task temp = head;
        while (temp.getNext() != null && !temp.getNext().getDescription().equals(description)) {
            temp = temp.getNext();
        }

        if (temp.getNext() != null) {
            temp.setNext(temp.getNext().getNext());
        }
    }

    public void markTaskCompleted(String description) {
        Task temp = head;
        while (temp != null) {
            if (temp.getDescription().equals(description)) {
                temp.markCompleted();
                return;
            }
            temp = temp.getNext();
        }
    }

    public void printTasks() {
        Task temp = head;
        while (temp != null) {
            System.out.println(temp.getDescription() + " - " + (temp.isCompleted() ? "Completed" : "Not Completed"));
            temp = temp.getNext();
        }
    }
}
