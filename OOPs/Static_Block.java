//Static Block -> we can write set of statements declare them static and it will run once the Main class is executed
//even if main() function will not call still static block will execute first
package com.prashant.OOP;

public class Static_Block {
    static {
        System.out.println("block1");
    }
    public static void main(String[] args) {
        System.out.println("Main"); // this will execute after static blocks
    }
    static {
        System.out.println("block2");
    }
}
