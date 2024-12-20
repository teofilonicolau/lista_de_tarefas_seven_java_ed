package com.example.exerciciosestruturadedados.listas.duplamente.encadeadas.editor.texto;




public class TextNode {
    private String text;
    private TextNode prev;
    private TextNode next;

    public TextNode(String text) {
        this.text = text;
        this.prev = null;
        this.next = null;
    }

    public String getText() {
        return text;
    }

    public TextNode getPrev() {
        return prev;
    }

    public void setPrev(TextNode prev) {
        this.prev = prev;
    }

    public TextNode getNext() {
        return next;
    }

    public void setNext(TextNode next) {
        this.next = next;
    }
}

