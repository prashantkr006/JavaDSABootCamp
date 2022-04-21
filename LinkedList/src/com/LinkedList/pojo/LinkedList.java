package com.LinkedList.pojo;

public class LinkedList {
    private Node head;
    private Node tail;
    private int size;

    LinkedList() {
        this.size = 0;
    }

    private class Node {
       private int value;
       private Node next;

       Node(int value) {
           this.value = value;
       }

       Node(Node next, int value) {
           this.value = value;
           this.next = next;
       }
    }

    //display nodes
    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.print("END ");
        System.out.println(size);
    }

    //ADD elements in linkedlist
    void add(int value) {
        Node node = new Node(value);
        node.next = head;
        head = node;
        if(tail == null)
            tail = head;
        size++;
    }

    //add at index
    void add(int pos, int value) {
        if(pos == 0){
            add(value);
            return;
        }
        if(pos == size + 1) {
            addAtEnd(value);
            return;
        }
        Node node = new Node(value);
        int idx = pos - 1;
        int i = 0;
        Node temp = head;
        while(i < idx-1){
           temp = temp.next;
           i++;
        }
        node.next = temp.next;
        temp.next = node;
        size++;
    }

    //add at the end
    void addAtEnd(int value) {
        Node node = new Node(value);
        tail.next = node;
        tail = node;
        size++;
    }

    //delete from start
    int remove() {
        int value = head.value;
        head = head.next;
        if(head == null)
            tail = null;
        size--;
        return value;
    }

    //remove from end
    int removeAtEnd() {
        int val = tail.value;
        //find previous node of the node to be removed
        Node prev_node = get(size-2);
        Node temp = head;
        while(temp != prev_node) {
            temp = temp.next;
        }
        temp.next = null;

        return val;
    }

    //remove at given index
    int removeAt(int idx) {
        if(idx <= 1)
        {
            remove();
            return head.value;
        }

        Node prev_node = get(idx-1);
        Node temp = head;
        while(temp != prev_node) {
            temp = temp.next;
        }
        int val = temp.next.value;
        temp.next = temp.next.next;
        return val;
    }

    //find the node
    int find(int key)
    {
        int idx = 0;
        Node temp = head;
        while (temp != null)
        {
            if(temp.value == key)
                return idx;
            temp = temp.next;
            idx++;
        }
        return -1;
    }
    //get node
    Node get(int idx) {
        Node temp = head;
        for(int i = 0; i < idx; i++) {
            temp = temp.next;
        }
        return temp;
    }
}

