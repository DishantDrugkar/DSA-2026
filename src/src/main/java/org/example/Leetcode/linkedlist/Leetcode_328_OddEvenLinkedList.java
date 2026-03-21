package org.example.Leetcode.linkedlist;

public class Leetcode_328_OddEvenLinkedList {
    class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    public void addLasst(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public void printLL(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    public Node oddEven(){
        if(head == null){
            return null;
        }
        Node odd = head;
        Node even = head.next;
        Node evenHead = even;
        while(even != null && even.next != null){
            odd.next = even.next;
            odd = odd.next;
            even.next = odd.next;
            even = even.next;
        }
        odd.next = evenHead;
        return head;
    }

    public static void main(String[] args) {
        Leetcode_328_OddEvenLinkedList ll = new Leetcode_328_OddEvenLinkedList();
        ll.addLasst(1);
        ll.addLasst(2);
        ll.addLasst(3);
        ll.addLasst(4);
        ll.addLasst(5);
        ll.printLL();

        ll.oddEven();
        ll.printLL();
    }
}
