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


    // DELETES NODE ON THE BASIS OF KEY
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

    //SEARCH THE KEY IN LL
    public boolean search(int key){
        Node temp = head;
        while(temp != null){
            if(temp.data == key){
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    //PRINT THE SIZE OF LL
    public int size(){
        int count = 0;
        Node temp = head;
        while(temp != null){
            count++;
            temp = temp.next;
        }
        return count;
    }

    public static void main(String[] args) {
        InsertElement list = new InsertElement();
        list.addFirst(3);
        list.addFirst(2);
        list.addFirst(1);
        list.addLast(4);
        list.printElement();
        System.out.println("size of LL is : " + list.size());
        list.deleteByKey(3);
        list.printElement();
        System.out.println("size of LL is : " + list.size());
        System.out.println(list.search(1));
    }
}
