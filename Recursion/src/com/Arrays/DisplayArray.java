package com.Arrays;

public class DisplayArray {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50};
        printElements(arr, arr.length-1);
        System.out.println("--");
        printReverseElements(arr, arr.length-1);
    }
    static void printElements(int[] arr, int n) {
        if(n < 0) return;

        printElements(arr, n-1);
        System.out.println(arr[n]);
    }

    static void printReverseElements(int[] arr, int n) {
        if(n < 0) return;

        System.out.println(arr[n]);
        printReverseElements(arr, n-1);
    }
}
