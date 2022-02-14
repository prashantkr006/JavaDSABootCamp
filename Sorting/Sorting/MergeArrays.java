package Sorting;

import java.util.Arrays;

public class MergeArrays {
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 4, 7, 11};
        int n = 5;
        int[] arr2 = {2, 4, 6, 13};
        int m = 4;
        System.out.println(Arrays.toString(merge(arr1, n, arr2, m)));
    }

    static int[] merge(int[] arr1, int n, int[] arr2, int m) {
        int[] mergedArr = new int[n + m];

        int i = 0;
        int j = 0;
        int count = 0;
        while(i < n && j < m) {
            if(arr1[i] < arr2[j]){
                mergedArr[count] = arr1[i];
                i++;
                count++;
            }
            else {
                mergedArr[count] = arr2[j];
                j++;
                count++;
            }
        }
        while(i < n){
            mergedArr[count] = arr1[i];
            count++;
            i++;
        }
        while (j < m){
            mergedArr[count] = arr2[j];
            count++;
            j++;
        }
        return mergedArr;
    }
}
