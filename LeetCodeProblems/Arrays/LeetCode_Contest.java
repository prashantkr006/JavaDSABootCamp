package EasyProblems;

import java.util.*;

public class LeetCode_Contest {
    public static void main(String[] args) {
        int[] nums = {6,4,3,2,7,6,2};
        System.out.println(replaceNonCoprimes(nums));
    }
    public static List<Integer> replaceNonCoprimes(int[] nums) {
        List<Integer> list = new ArrayList<>();
        //input all the elements to the list
        for(int i = 0; i < nums.length; i++) {
            list.add(nums[i]);
        }
        int count = 0;

        while(count < list.size()) {
            if(findGCD(list.get(count), list.get(count + 1)) > 1){
                list.add(count, findLCM(list.get(count), list.get(count + 1)));
                list.remove(count + 1);
            }
            else count++;
        }
        return list;
    }

    public static int findGCD(int number1, int number2) {
        //base case
        if(number2 == 0)
        { return number1; }
        return findGCD(number2, number1%number2);
    }

    public static int findLCM(int n1, int n2) {

        // maximum number between n1 and n2 is stored in lcm
        int lcm = (n1 > n2) ? n1 : n2;

        // Always true
        while(true) {
            if( lcm % n1 == 0 && lcm % n2 == 0 ) {
                return lcm;
            }
            ++lcm;
        }
    }
}
