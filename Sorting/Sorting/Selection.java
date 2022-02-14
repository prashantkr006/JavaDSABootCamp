package Sorting;

import java.util.Arrays;

public class Selection {
    /*
    Idea of selection sort( if ascending) pick minimum element swap it to the element of index 0 then move ahead
    and keep doing it till the whole array is not sorted
    Time complexity - O(n), Space complexity - O(1)
     */
    public static void main(String[] args) {
        int[] arr = {7, 2, 9, 6, 1, 5, 4};
        sortAscending(arr);
        System.out.println(Arrays.toString(arr));
        sortDescending(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void sortAscending(int[] arr){
        // sort in ascending order
        for(int i = 0; i < arr.length-1; i++) { //0 to length-2
            int min = arr[i]; // assuming arr[i] is minimum for now
            int minIndex = i; // saving its Index
            for(int j = i+1; j < arr.length; j++) { // i+1 to length - 1
                if(arr[j] < min) {
                    min = arr[j]; // update it with minimum value
                    minIndex = j; // update the index of minimum
                }
            }
            swap(arr, i, minIndex); //swap minimum value to the ith value
        }
    }

    static void sortDescending(int[] arr) {
        // sorting in descenginf order
        for(int i = 0; i < arr.length-1; i++) { // 0 to length - 2
            int max = arr[i]; // assuming arr[i] is the maximum
            int maxIndex = i; // save index of max
            for(int j = i+1; j < arr.length; j++) {
                if(arr[j] > max){
                    max = arr[j];
                    maxIndex = j;
                }
            }
            swap(arr, i, maxIndex);
        }
    }

    private static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}