package com.example.exerciciosestruturadedados.listas.duplamente.encadeadas.jogo.cartas;




public class PlayerHand {
    private Card head;
    private Card tail;

    public void addCard(String value) {
        Card newCard = new Card(value);
        if (head == null) {
            head = newCard;
            tail = newCard;
        } else {
            tail.setNext(newCard);
            newCard.setPrev(tail);
            tail = newCard;
        }
    }

    public void removeCard(String value) {
        if (head == null) return;

        if (head.getValue().equals(value)) {
            head = head.getNext();
            if (head != null) {
                head.setPrev(null);
            } else {
                tail = null;
            }
            return;
        }

        Card temp = head;
        while (temp != null && !temp.getValue().equals(value)) {
            temp = temp.getNext();
        }

        if (temp != null) {
            if (temp.getNext() != null) {
                temp.getNext().setPrev(temp.getPrev());
            } else {
                tail = temp.getPrev();
            }

            if (temp.getPrev() != null) {
                temp.getPrev().setNext(temp.getNext());
            }
        }
    }

    public void printHand() {
        Card temp = head;
        while (temp != null) {
            System.out.print(temp.getValue() + " ");
            temp = temp.getNext();
        }
        System.out.println();
    }
}
