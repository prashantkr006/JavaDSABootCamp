/*
final => this is a keyword. It is used to prevent to modify the content
 */
package com.prashant.OOP;

public class Final_in_OOP {
    public static void main(String[] args) {
        final int num = 10;
        System.out.println(num);
        /*
        num = 30; //this  will show an error of, cannot assign a value of final variable name,
                  //because 30 is already assigned to num.
         */
        //a final variable can't be assigned to new object but its instance variable can be assigned to new value
        //eg->
       final Student prashant = new Student();
       prashant.stuName = "Prashant Kumar Roy";
       /*
       prashant = new Student(); // this will give an error, cannot assign a value to final variable
        */
    }

    // final variable have to be initialized when you are using it inside any class
    static class Student {
        /*
        final String name; // it will show an error that name has to be initialized
         */
        String stuName;
    }
    //Note:-Always initialize it while declaring it.
}
