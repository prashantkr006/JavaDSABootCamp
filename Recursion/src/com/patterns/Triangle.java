package com.patterns;

public class Triangle {
    public static void main(String[] args) {
        printTriangle(5, 0);
    }
    static void printTriangle(int rows, int col) {
        if(rows == 0)
            return;
        if(col == rows) {
            printTriangle(rows-1, 0);
            System.out.println();
        }
        else{
            printTriangle(rows, col+1);
            System.out.print("* ");
        }
    }
}
