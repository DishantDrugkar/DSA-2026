package org.example.implementation.linkedlist;

public class MiddleElement {
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

    // ADD FIRST NODE IN LL
    public void addFirst(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }


    // ADD LAST NODE IN LL
    public void addLast(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    // PRINT LL
    public void printElement(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }


    public Node middle(Node head){
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
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
        MiddleElement list = new MiddleElement();
        list.addFirst(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        list.addLast(5);
        list.addLast(6);
        list.printElement();
        Node mid = list.middle(list.head);
        System.out.println(mid.data);

        list.deleteByKey(6);
        list.printElement();
        Node mid1 = list.middle(list.head);
        System.out.println(mid1.data);
    }
}
