package com.sort;

import java.util.Arrays;

public class InPlaceMergeSort {
    public static void main(String[] args) {
        int[] arr = {3, 12, 4};
        mergeSortInPlace(arr, 0, arr.length);
        System.out.println(Arrays.toString(arr));
    }

    static  void mergeSortInPlace(int[] arr, int s, int e) {
        if(e - s == 1)
            return;
        int mid = s + (e-s) / 2;
        mergeSortInPlace(arr, s, mid);
        mergeSortInPlace(arr, mid, e);

        merge(arr, s, mid, e);
    }

    static void merge(int[] arr, int s, int m, int e) {
        int[] mix = new int[s + e];
        int p1 = s;
        int p2 = m;
        int k = 0;
        while(p1 < m && p2 < e) {
            if(arr[p1] < arr[p2]) {
                mix[k] = arr[p1];
                p1++;
                k++;
            }
            else {
                mix[k] = arr[p2];
                k++;
                p2++;
            }
        }
        while(p1 < m) {
            mix[k] = arr[p1];
            k++;
            p1++;
        }
        while(p2 < e) {
            mix[k] = arr[p2];
            k++;
            p2++;
        }
        for(int l = 0; l < mix.length; l++) {
            arr[s+l] = mix[l];
        }
    }
}
