package com.Arrays;

import java.util.Arrays;

public class AllIndices {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 20, 20, 40, 50, 10, 20, 30, 60, 70, 80};
        System.out.println(Arrays.toString(findIndics(arr, 0, 20, 0)));
    }

    static int[] findIndics(int[] arr, int idx, int target, int fsf) {
        if (idx == arr.length)
            return new int[fsf];
        int[] iarr;
        if (arr[idx] == target) {
            iarr = findIndics(arr, idx + 1, target, fsf + 1);
            iarr[fsf]  = idx;
        } else {
            iarr = findIndics(arr, idx + 1, target, fsf);
        }
        return iarr;
    }
}
