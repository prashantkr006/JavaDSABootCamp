package Arrays;

public class Array_from_Permutation {

    public static void main(String[] args) {
        int[] nums = {0,2,1,5,3,4};
        ;
        printArray(buildArray(nums));
    }

    public static void printArray(int[] arr) {
        for(int x: arr){
            System.out.print(x+" ");
        }
    }
    public static int[] buildArray(int[] nums) {

        int[] ans = new int[nums.length];

        for(int i = 0; i < ans.length; i++) {
            ans[i] = nums[nums[i]];
        }
        return ans;
    }
}
