package com.LinkedList.single;

import com.LinkedList.single.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.add(3);
        ll.add(4);
        ll.add(7);
        ll.add(9);
        System.out.println("ADD ELEMENTS");
        ll.display();
        System.out.println("ADD AT THE END");
        ll.addAtEnd(10);
        ll.display();
        System.out.println("ADD AT POSITION");
        ll.add(5, 12);
        ll.display();
        System.out.println("REMOVE ELEMENTS");
        ll.remove();
        ll.display();
        System.out.println("REMOVE AT THE END");
        System.out.println(ll.removeAtEnd());
        ll.display();
        System.out.println("REMOVE AT INDEX");
        ll.removeAt(2);
        ll.display();
        System.out.println(ll.find(12));
    }
}
