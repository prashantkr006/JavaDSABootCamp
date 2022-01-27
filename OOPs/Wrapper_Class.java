/*Introduction to wrapper classes
-> Wrapper classes makes primitives into an object
    example: int num = 10; // here num is a primitive variable
    it can be changed into an object by the help of Wrapper class
    -> Integer num = new Integer (10); // wrapper class
    now num will act as an object.
*/
package com.prashant.OOP;

public class Wrapper_Class {
    public static void main(String[] args) {
        int num = 10; //normal primitive variable
        Integer a = 10; //a will act as an object.
        System.out.println(a + " is type of " + a.getClass().getName());
    }
}
