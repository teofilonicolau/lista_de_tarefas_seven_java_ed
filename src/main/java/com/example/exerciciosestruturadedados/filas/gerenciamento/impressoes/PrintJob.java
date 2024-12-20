package com.example.exerciciosestruturadedados.filas.gerenciamento.impressoes;




public class PrintJob {
    private String documentName;
    private PrintJob next;

    public PrintJob(String documentName) {
        this.documentName = documentName;
        this.next = null;
    }

    public String getDocumentName() {
        return documentName;
    }

    public PrintJob getNext() {
        return next;
    }

    public void setNext(PrintJob next) {
        this.next = next;
    }
}
