package org.example.implementation.linkedlist;

public class InsertElement {
    class Node{
        int data;
        Node next;
        public Node(int data ){
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


    public void addLast(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public void printElement(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }


    public void deleteByKey(int key){
        if(head ==  null){
            return;
        }
        if(head.data == key){
            head = head.next;
            return;
        }

        Node currNode = head;
        while(currNode.next != null){
            if(currNode.next.data == key){
                currNode.next = currNode.next.next;
                return;
            }
            currNode = currNode.next;
        }
    }
    public static void main(String[] args) {
        InsertElement list = new InsertElement();
        list.addFirst(3);
        list.addFirst(2);
        list.addFirst(1);
        list.addLast(4);
        list.printElement();
        list.deleteByKey(3);
        list.printElement();
    }
}
