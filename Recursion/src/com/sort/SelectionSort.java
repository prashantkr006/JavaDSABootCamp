package com.sort;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {1, 4, 2, 6, 5, 8, 3};
        System.out.println("before sort: " + Arrays.toString(arr));
        sort(arr, 0, arr.length - 1, 1);
        System.out.println("after sort: " + Arrays.toString(arr));
    }
    static void sort(int[] arr, int maxIdx, int r, int c) {
        if(r < 0)
            return;
        if(c <= r) {
            if(arr[maxIdx] < arr[c])
                maxIdx = c;
            sort(arr, maxIdx, r, c + 1);
        }
        else {
             //swap max with element at last
             swap(arr, maxIdx, r);
            sort(arr, 0, r - 1, 1);
        }
    }

    public static void swap(int[] arr, int n1, int n2) {
        int temp = arr[n1];
        arr[n1] = arr[n2];
        arr[n2] = temp;
    }
}
