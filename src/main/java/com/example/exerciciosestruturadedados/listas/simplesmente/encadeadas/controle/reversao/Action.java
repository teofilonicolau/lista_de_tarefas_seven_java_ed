package com.example.exerciciosestruturadedados.listas.simplesmente.encadeadas.controle.reversao;


public class Action {
    private String description;
    private Action next;

    public Action(String description) {
        this.description = description;
        this.next = null;
    }

    public String getDescription() {
        return description;
    }

    public Action getNext() {
        return next;
    }

    public void setNext(Action next) {
        this.next = next;
    }
}
