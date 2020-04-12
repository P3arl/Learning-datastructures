package com.p3arl.ds.linkedlist.singly;

public class SinglyLinkedList {
    private Node first;
    private Node last;

    public SinglyLinkedList() {

    }

    public boolean isEmpty() {
        return first == null;
    }

    public void insertFirst(int data) {
        Node newNode = new Node();
        newNode.data = data;
        newNode.next = first;
        first = newNode;
    }

    public void insertLast(int data) {
        Node current = first;
        while (current.next != null) {
            current = current.next;
        }
        Node n = new Node();
        n.data = data;
        current.next = n;
    }
    public Node deleteFirst() {
        Node temp = first;
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
}
