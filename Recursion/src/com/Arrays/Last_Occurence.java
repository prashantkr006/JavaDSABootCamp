package com.Arrays;

public class Last_Occurence {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 20, 20, 40, 50, 10, 20, 30, 60, 70, 80};
        System.out.println(lastOccurence(arr, 0,30));

    }
    static int lastOccurence(int[] arr, int idx, int target) {

        if(idx == arr.length)
            return -1;

        int lastIdxInSmallArr = lastOccurence(arr, idx + 1, target);
        if(lastIdxInSmallArr == -1) {
            if(arr[idx] == target)
                return idx;
            else
                return -1;
        }
        else
            return lastIdxInSmallArr;
    }
}
