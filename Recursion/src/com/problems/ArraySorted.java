package com.problems;

public class ArraySorted {
    public static void main(String[] args) {
        int[] arr = {2, 4, 5, 19, 30};
        System.out.println(isSorted(arr, arr.length));
    }

    public static boolean isSorted(int[] arr, int size) 
    {
        if(arr == null || size < 2)
            return true;

        return (arr[size-1] > arr[size-2]) && isSorted(arr, size-1);
    }
}
