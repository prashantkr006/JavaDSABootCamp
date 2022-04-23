package com.LinkedList.doubly;

import com.LinkedList.doubly.DoublyLinkedList;

public class Main_DoublyLinkedList {
    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.add(4);
        dll.add(2);
        dll.add(8);
        dll.add(9);
        dll.display();
        dll.addAtEnd(10);
        dll.display();
        dll.add(2, 13);
        dll.display();
        /*DELETE OPERATIONS*/
        dll.remove();
        dll.display();
        dll.removeAtEnd();
        dll.display();
        dll.removeAt(2);
        dll.display();
    }
}
