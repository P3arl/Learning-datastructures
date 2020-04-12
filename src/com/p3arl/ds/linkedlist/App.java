package com.p3arl.ds.linkedlist;

public class App {

    public static void main(String[] args) {
        Node nodeA = new Node();
        nodeA.data = 4;

        Node nodeB = new Node();
        nodeB.data = 3;

        Node nodeC = new Node();
        nodeB.data = 7;

        Node nodeD = new Node();
        nodeB.data = 8;

        nodeA.next = nodeB;
        nodeB.next = nodeC;
        nodeC.next = nodeD;

        System.out.println(listLength(nodeA));
        System.out.println(listLength(nodeB));
    }

    public static int listLength(Node node) {
        int length = 0;
        Node currentNode = node;
        while(currentNode != null) {
            length += 1;
            node = node.next;
        }
        return length;
    }
}
