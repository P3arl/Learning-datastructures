package com.p3arl.ds.linkedlist.circular;

public class CircularLinkedList {

    private Node first;
    private Node last;

    public CircularLinkedList() {
        first = null;
        last = null;
    }

    public void insertFirst(int data) {
        Node n = new Node();
        n.data = data;

        if(isEmpty()) {
            last = n;
        }
        n.next = first;
        first = n;
    }

    public void insertLast(int data) {
        Node n = new Node();
        n.data = data;

        if(isEmpty()) {
            first = n;
        } else {
            last.next = n;
            last = n;
        }
    }

    public int deleteFirst() {
        int temp = first.data;

        if(first.next == null) {
            last = null;
        }
        first = first.next;
        return temp;
    }

    public void displayList() {
        System.out.println("List ");
        Node current = first;
        while (current != null) {
            current.displayNode();
            current = current.next;
        }
        System.out.println();
    }

    private boolean isEmpty() {
        return first == null;
    }
}
