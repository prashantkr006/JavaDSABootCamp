package EasyProblems;

public class Even_Number_Digits {
    public static void main(String[] args) {
        int[] nums = {12,345,2,6,7896};
        System.out.println(findNumbers(nums));
    }

    static public int findNumbers(int[] nums) {

        int sumofEve = 0;
        for(int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int count = 0;
            while(num > 0) {
                num = num / 10;
                count++;
            }
            if(count % 2 == 0)
                sumofEve++;
        }
        return sumofEve;
    }
}
