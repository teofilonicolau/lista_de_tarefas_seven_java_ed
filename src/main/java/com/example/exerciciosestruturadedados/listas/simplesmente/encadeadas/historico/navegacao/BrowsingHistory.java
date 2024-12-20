package com.example.exerciciosestruturadedados.listas.simplesmente.encadeadas.historico.navegacao;




public class BrowsingHistory {
    private UrlNode head;
    private int size;
    private int maxSize;

    public BrowsingHistory(int maxSize) {
        this.maxSize = maxSize;
        this.size = 0;
        this.head = null;
    }

    public void visitUrl(String url) {
        UrlNode newNode = new UrlNode(url);
        if (head == null) {
            head = newNode;
        } else {
            UrlNode temp = head;
            while (temp.getNext() != null) {
                temp = temp.getNext();
            }
            temp.setNext(newNode);
        }
        size++;

        if (size > maxSize) {
            head = head.getNext();
            size--;
        }
    }

    public void printHistory() {
        UrlNode temp = head;
        while (temp != null) {
            System.out.println(temp.getUrl());
            temp = temp.getNext();
        }
    }
}
