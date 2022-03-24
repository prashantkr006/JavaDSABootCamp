package com.problems;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(fibo(5));
    }
    public static int fibo(int n) {
        //base case
        if(n < 2)
        return n;

        return fibo(n-1) + fibo(n-2);
    }
}
