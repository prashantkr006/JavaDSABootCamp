package com.sort;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {1, 4, 2, 6, 5, 8, 3};
        sort(arr, arr.length-1, 0);
        System.out.println(Arrays.toString(arr));
    }

    public static void sort(int[] arr, int r, int c)
    {
        if(r < 0)
            return;
        if(c < r) {
            if(arr[c] > arr[c+1])
                swap(arr, c, c+1);
            sort(arr, r, c + 1);
        }
        else {
            sort(arr, r - 1, 0);
        }
    }

    public static void swap(int[] arr, int n1, int n2) {
        int temp = arr[n1];
        arr[n1] = arr[n2];
        arr[n2] = temp;
    }
}
