package org.example.dsa2026.LinkedList;

public class AddFirstMethod {
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    public void addFirst(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
            return;
        }

        newNode.next = head;

        head = newNode;
    }
    public static void main(String[] args) {
        AddFirstMethod node = new AddFirstMethod();
        node.addFirst(1);
        node.addFirst(2);
        node.addFirst(3);

    }
}
