package Sort;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {3, 1, 2, 6, 8, 9, 10, 2};
        System.out.println("before mergesort " + Arrays.toString(arr));
        mergeSort(arr);
        System.out.println("after mergesort"+Arrays.toString(arr));
    }

    static int[] mergeSort(int[] arr) 
    {
        if(arr.length == 1)
            return arr;
        int mid = arr.length / 2;
        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid + 1, arr.length));

        return merge(left, right);
    }

    static int[] merge(int[] first, int[] second) {
        int[] mergedArr = new int[first.length + second.length];
        int p1 = 0;
        int p2 = 0;
        int k = 0;
        while(p1 < first.length && p2 < second.length)
        {
            if(first[p1] < second[p2]) {
                mergedArr[k] = first[p1];
                k++;
                p1++;
            }
            else {
                mergedArr[k] = second[p2];
                k++;
                p2++;
            }
        }
        while(p1 < first.length) {
            mergedArr[k] = first[p1];
            k++;
            p1++;
        }

        while(p2 < second.length) {
            mergedArr[k] = first[p2];
            k++;
            p2++;
        }

        return mergedArr;
    }
}
