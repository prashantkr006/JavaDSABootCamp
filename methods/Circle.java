package methods;

import java.util.Scanner;

public class Circle {
    static double circmference(float radius){
        double circumference = 2 * Math.PI * radius;
        return circumference;
    }

    static double area(float radius){
        double area = Math.PI * radius * radius;
        return area;
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            float radius = sc.nextFloat();

            System.out.println("Area of circle of radius "+ radius + " is " + String.format("%.2f", area(radius)) + "\n and circumference is " + String.format("%.2f", circmference(radius)));
        }
    }
}
