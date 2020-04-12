package com.p3arl.ds.linkedlist.doubly;

import javax.sound.midi.Soundbank;

public class DoublyLinkedList {
    private Node first;
    private Node last;

    public DoublyLinkedList() {
        this.first = this.last = null;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public void insertFirst(int data) {
        Node n = new Node();
        n.data = data;

        if (isEmpty()) {
            last = n;
        } else {
            first.prev = n;
        }
        n.next = first;
        this.first = n;
    }

    public void insertLast(int data) {
        Node n = new Node();
        n.data = data;

        if (isEmpty()) {
            first = n;
        } else {
            last.next = n; // old last to new node
            n.prev = last; // old last will be new node previous
        }
        last = n;
    }

    public Node deleteFirst() {
        Node temp = first;

        if(first.next == null) {
            last = null;
        } else {
            first.next.prev = null;
        }
        first = first.next; //
        return temp;
    }

    public Node deleteLast() {
        Node temp = last;

        if(first.next == null) {
            first = null;
        } else {
            last.prev.next = null;
        }
        last = last.prev;
        return temp;
    }

    public boolean insertAfter(int key, int data) {
        Node current = first;
        while (current.data != key) {
            current = current.next;
            if(current == null) {
                return false;
            }
        }
        Node n = new Node();
        n.data = data;

        if(current == last) {
            current.next = null;
            last = n;
        } else {
            n.next = current.next;
            current.next.prev = n;
        }
        n.prev = current;
        current.next = n;

        return true;
    }

    public Node deleteKey(int key) {
        Node current = first;

        while (current.data != key) {
            current = current.next;
            if(current == null) {
                return null;
            }
        }
        if(current == first) {
            first = current.next;
        } else {
            current.prev.next = current.next;
        }
        if(current == last) {
            last = current.prev;
        } else {
            current.next.prev = current.prev;
        }
        return current;
    }

    public void displayForward() {
        System.out.println("List::[first--last]");
        Node current = first;
        while (current != null) {
            current.displayNode();
            current = current.next;
        }
        System.out.println();
    }

    public void displayBackward() {
        System.out.println("List::[last--first]");
        Node current = last;
        while (current != null) {
            current.displayNode();
            current = current.prev;
        }
        System.out.println();
    }
}
