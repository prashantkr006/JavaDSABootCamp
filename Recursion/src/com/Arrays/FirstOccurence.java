package com.Arrays;

public class FirstOccurence {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 20, 40, 50, 30};
        System.out.println(firstOccurence(arr, 0, 30));
    }
    static int firstOccurence(int[] arr, int idx, int target) {
        if(idx == arr.length)
            return -1;
        return target == arr[idx] ? idx : firstOccurence(arr, idx+1, target);
    }
}
