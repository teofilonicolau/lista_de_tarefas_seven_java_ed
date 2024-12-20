package com.example.exerciciosestruturadedados.filas.fila.processos;



public class Process {
    private String processName;
    private Process next;

    public Process(String processName) {
        this.processName = processName;
        this.next = null;
    }

    public String getProcessName() {
        return processName;
    }

    public Process getNext() {
        return next;
    }

    public void setNext(Process next) {
        this.next = next;
    }
}
