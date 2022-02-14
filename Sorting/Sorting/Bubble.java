package Sorting;

import java.util.Arrays;

public class Bubble {
    /*
    Idea is that keep swapping all the elements to each other according to your need for ascending or descending
     */
    public static void main(String[] args) {
        int[] arr = {3, 7, 2, 9, 12, 6};
        sortAscending(arr);
        System.out.println(Arrays.toString(arr));
        sortDescending(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void sortAscending(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr.length-i-1; j++) {
                if(arr[j] > arr[j+1]){
                    swap(arr, j, j+1);
                }
            }
        }
    }

    static void sortDescending(int[] arr) {
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length-i-1; j++) {
                if(arr[j] < arr[j+1]){
                    swap(arr, j, j+1);
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
