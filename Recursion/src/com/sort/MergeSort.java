package com.sort;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {3, 1, 2};
        System.out.println("before mergesort: " + Arrays.toString(arr));
        arr = mergeSort(arr);
        System.out.println("after mergesort: " + Arrays.toString(arr));
    }

    static int[] mergeSort(int[] arr) {
        if(arr.length == 1)
            return arr;
        int mid = arr.length / 2;

        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(left, right);
    }

    static int[] merge(int[] ar1, int[] ar2) {
        int[] mix = new int[ar1.length + ar2.length];
        int p1 = 0;
        int p2 = 0;
        int k = 0;
        while(p1 < ar1.length && p2 < ar2.length) {
            if(ar1[p1] < ar2[p2]) {
                mix[k] = ar1[p1];
                p1++;
                k++;
            }
            else {
                mix[k] = ar2[p2];
                k++;
                p2++;
            }
        }
        while(p1 < ar1.length) {
            mix[k] = ar1[p1];
            k++;
            p1++;
        }
        while(p2 < ar2.length) {
            mix[k] = ar2[p2];
            k++;
            p2++;
        }
    return mix;
    }
}
