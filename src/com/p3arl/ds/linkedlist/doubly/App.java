package com.p3arl.ds.linkedlist.doubly;

public class App {

    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        list.insertFirst(100);
        list.insertFirst(50);
        list.insertFirst(55);
        list.insertLast(99);
        list.insertLast(88);
        list.insertLast(99999);
        list.displayForward();
        list.displayBackward();
        list.deleteFirst();
        list.deleteLast();
        list.deleteKey(99);
        list.displayForward();
        list.insertAfter(100, 77);
        list.insertAfter(88, 33);
        list.displayForward();
    }
}
