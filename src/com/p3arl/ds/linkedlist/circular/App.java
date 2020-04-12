package com.p3arl.ds.linkedlist.circular;

import com.p3arl.ds.linkedlist.singly.SinglyLinkedList;

public class App {

    public static void main(String[] args) {
        CircularLinkedList list = new CircularLinkedList();
        list.insertFirst(100);
        list.insertFirst(50);
        list.insertFirst(99);
        list.insertFirst(88);
        list.insertLast(99999);

        list.displayList();
    }
}
