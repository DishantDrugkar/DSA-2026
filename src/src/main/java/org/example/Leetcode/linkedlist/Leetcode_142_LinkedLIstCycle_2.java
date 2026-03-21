package org.example.Leetcode.linkedlist;

public class Leetcode_142_LinkedLIstCycle_2 {
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

    public void addLast(int data){
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
    public boolean isCycle(){
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                return true;
            }
        }
        return false;
    }

    public Node isCycle2(){
        Node slow = head;
        Node fast = head;
        while(fast != null &&  fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                Node start = head;
                while(start != slow){
                    start = start.next;
                    slow = slow.next;
                }
                return start;
            }
        }
        return null;
    }
    public static void main(String[] args) {
        Leetcode_142_LinkedLIstCycle_2 ll = new Leetcode_142_LinkedLIstCycle_2();
        ll.addLast(3);
        ll.addLast(2);
        ll.addLast(0);
        ll.addLast(4);
//        ll.addLast(5);
//        ll.addLast(6);
        ll.printLL();
        tail.next = head.next;
        Node list = ll.isCycle2();
        System.out.println(list.data);
    }
}
