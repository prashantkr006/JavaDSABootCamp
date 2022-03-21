import java.util.*;

public class Find_Duplicates {
    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
        System.out.println(findDuplicates(nums));
    }

    public static List<Integer> findDuplicates(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        
        for(int i = 0 ; i < nums.length ; i++){
            int index = Math.abs(nums[i]) - 1;
            if(nums[index] < 0){
                ans.add(index + 1);
            }
            nums[index] = -nums[index];
        }
        return ans;
    }
}
