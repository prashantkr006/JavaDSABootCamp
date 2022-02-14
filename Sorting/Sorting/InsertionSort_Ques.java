package Sorting;
import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort_Ques {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i = 0; i < n; i++)
                arr[i] = sc.nextInt();
            sortAscending(arr);
            System.out.println(Arrays.toString(arr));
            t--;
        }
    }

    static void sortAscending(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for(int j = i + 1; j > 0; j--) {
                if(arr[j] < arr[j - 1])
                    swap(arr, j, j - 1);
            }
        }
    }

    private static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
