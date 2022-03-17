import java.util.*;

public class Sum_after_K_Concatenation {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(3);
        System.out.println(maxSubSumKConcat(arr, 2, 3));

    }

    public static long maxSubSumKConcat(ArrayList<Integer> arr, int n, int k) {
        // Write your code here
        ArrayList<Integer> mergedArr = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            mergedArr.addAll(arr);
        }
        //find subarray with the maximum sum
        long curSum = 0;
        long maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < n * k; i++) {
            curSum += mergedArr.get(i);
            maxSum = Math.max(curSum, maxSum);
            if (curSum < 0) {
                curSum = 0;
            }
        }
        System.out.println(mergedArr);
        return maxSum;
    }
}