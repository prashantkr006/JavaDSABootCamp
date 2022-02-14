package Sorting;

import java.util.Arrays;

public class Insertion {
    /*
    Idea is that assume the array in two partition left side is sorted one and right side is unsorted
    run two loops 1st will run i=0 to length-2
    2nd loop will go j=i+1 to 1
    if ascending then check if arr[j] < arr[j-1] if yes then swap elements if no then move ahead for next element
    similarly for descending just check if its ">" or not.
    Time oomplexity - o(n2), Space complexity - O(1)
     */
    public static void main(String[] args) {
        int[] arr = {7, 2, 9, 6, 1, 5, 4};
        sortAscending(arr);
        System.out.println(Arrays.toString(arr));
        sortDescending(arr);
        System.out.println(Arrays.toString(arr));
    }

    static  void sortDescending(int[] arr) {
        for(int i = 0; i < arr.length - 1; i++) {
            for(int j = i+1; j > 0; j--) {
                if(arr[j] > arr[j-1]){
                    swap(arr, j, j-1);
                }
            }
        }
    }
    static void sortAscending(int[] arr) {
        for(int i = 0; i < arr.length - 1; i++) {
            for(int j = i+1; j > 0; j--) {
                if(arr[j] < arr[j-1]){
                    swap(arr, j, j-1);
                }
            }
        }
    }
    private static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
