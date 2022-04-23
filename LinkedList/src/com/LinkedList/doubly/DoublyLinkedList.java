package com.LinkedList.doubly;

public class DoublyLinkedList {
    private Node head;
    private Node tail;
    private int size;

    DoublyLinkedList() {
        this.size = 0;
    }

    private class Node {
        private int data;
        private Node next;
        private Node prev;

        Node(int data) {
            this.data = data;
        }
    }

    //add
    void add(int data) {
        Node node = new Node(data);
        node.next = head;
        node.prev = null;
        if(head != null)
            head.prev = node;
        head = node;

        if (tail == null){
            tail = head;
        }
        size++;
    }

    //add at end
    void addAtEnd(int data) {
        Node node = new Node(data);
        tail.next = node;
        node.prev = tail;
        tail = node;
        size++;
    }

    //add in between
    void add(int pos, int data) {
        if(pos <= 0) {
            add(data);
            return;
        }
        Node node = new Node(data);
        Node prev_node = get(pos - 1);
        node.prev = prev_node;
        node.next = prev_node.next;
        prev_node.next = node;
        size++;
    }

    //delete
    int remove() {
        int val = head.data;
        head.next.prev = null;
        head = head.next;
        size--;

        return val;
    }

    //delete at the end
    int removeAtEnd() {
        int val = tail.data;
        Node prev_node = get(size-2);
        prev_node.next = null;
        tail = prev_node;
        size--;

        return val;
    }

    //delete in between
    int removeAt(int idx) {
        if(idx == 0){
            return remove();
        }
        if(idx == size-1) {
            return removeAtEnd();
        }
        Node prev_node = get(idx-1);
        int val = prev_node.next.data;

        prev_node.next.next.prev = prev_node;
        prev_node.next = prev_node.next.next;
        return val;
    }

    //find by index
    Node get(int idx) {
        Node temp = head;
        for(int i = 0; i < idx; i++)
            temp = temp.next;
        return temp;
    }

    //display node
    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }
}
