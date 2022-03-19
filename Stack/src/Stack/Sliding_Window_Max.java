package Stack;
import java.util.*;

public class Sliding_Window_Max {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.println(Arrays.toString(maxSlidingWindow(arr, 3)));
        } catch (Exception e) {
            //TODO: handle exception
        }
    }

    public static int[] maxSlidingWindow(int[] nums, int k) throws Exception {
        int n = nums.length;
        Stack<Integer> st = new Stack<>();
        int[] maxWin = new int[n - k];
        
        for(int i = 0; i <= n-k; i++) {
            int max = Integer.MIN_VALUE;
            for(int j = i; j < i + k; j++) {
                while(!st.isEmpty() && nums[j] > nums[st.peek()]) {
                    st.pop();
                }
                max = Math.max(nums[j], max);
                st.push(j);
            }
            maxWin[i] = max;
        }
    return maxWin;
    }
}