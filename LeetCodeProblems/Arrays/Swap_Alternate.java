package LeetCodeProblems.Arrays;

import java.util.Arrays;

public class Swap_Alternate {
    public static void main(String[] args) {
        int[] arr = {1, 2, 7, 8, 5};
        System.out.println(Arrays.toString(swapAlternates(arr)));
    }
    
    static int[] swapAlternates(int[] arr) {
        
        for(int i = 0; i < arr.length - 1; i+=2) {
            int temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;
        }

        return arr;
    }
}
