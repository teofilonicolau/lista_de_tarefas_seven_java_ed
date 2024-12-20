package com.example.exerciciosestruturadedados.listas.simplesmente.encadeadas.historico.navegacao;




public class UrlNode {
    private String url;
    private UrlNode next;

    public UrlNode(String url) {
        this.url = url;
        this.next = null;
    }

    public String getUrl() {
        return url;
    }

    public UrlNode getNext() {
        return next;
    }

    public void setNext(UrlNode next) {
        this.next = next;
    }
}

