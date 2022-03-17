package Arrays;

public class Running_Sum {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        printArray(runningSum(nums));
    }

    public static void printArray(int[] arr) {
        for (int x : arr) {
            System.out.print(x + " ");
        }
    }

    public static int[] runningSum(int[] nums) {
        int[] ans = new int[nums.length];

        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[i] + sum;
            sum = ans[i];
        }
        return ans;
    }
}
