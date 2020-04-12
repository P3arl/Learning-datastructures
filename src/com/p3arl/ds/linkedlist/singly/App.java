package com.p3arl.ds.linkedlist.singly;

public class App {

    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        list.insertFirst(100);
        list.insertFirst(50);
        list.insertFirst(99);
        list.insertFirst(88);
        list.insertLast(99999);

        list.displayList();
    }
}
