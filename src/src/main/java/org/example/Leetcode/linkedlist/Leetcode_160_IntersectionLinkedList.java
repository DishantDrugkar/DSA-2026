package org.example.Leetcode.linkedlist;

public class Leetcode_160_IntersectionLinkedList {

    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public Node intersection(Node headA, Node headB) {
        Node a = headA;
        Node b = headB;

        while (a != b) {
            if (a == null) a = headB;
            else a = a.next;

            if (b == null) b = headA;
            else b = b.next;
        }

        return a;
    }

    public static void main(String[] args) {
        Leetcode_160_IntersectionLinkedList obj = new Leetcode_160_IntersectionLinkedList();

        // Common part
        Node common = obj.new Node(4);
        common.next = obj.new Node(5);

        // List A
        Node headA = obj.new Node(1);
        headA.next = obj.new Node(2);
        headA.next.next = obj.new Node(3);
        headA.next.next.next = common;

        // List B
        Node headB = obj.new Node(9);
        headB.next = common;

        Node result = obj.intersection(headA, headB);

        if (result != null) {
            System.out.println("Intersection at node: " + result.data);
        } else {
            System.out.println("No intersection");
        }

    }
}