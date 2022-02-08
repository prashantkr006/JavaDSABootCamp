package com.prashant.OOP.Polymorphism;

public class Square extends Shape {

    void area(int side) {
        System.out.println("area of square is " + side*side);
    }

    Square(int side){
        area(side);
    }
}
