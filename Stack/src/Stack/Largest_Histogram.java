package Stack;
import java.util.*
;
public class Largest_Histogram {
    public static void main(String[] args) {
        try {
            try (Scanner sc = new Scanner(System.in)) {
                int n = sc.nextInt();
                int[] heights = new int[n];
                for(int i = 0; i < n; i++) {
                    heights[i] = sc.nextInt();
                }

                System.out.println(largestRectangleArea(heights));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static int largestRectangleArea(int[] heights) {
        int n = heights.length;
        Stack<Integer> st;
        //next smallest height to the right
        int[] nser = new int[n];
        st = new Stack<>();
        for(int i = 0; i < n; i++) {
            while(!st.isEmpty() && heights[i] < heights[st.peek()]) {
                nser[st.pop()] = i;
            }
            st.push(i);
        }
        while(!st.isEmpty()) {
            int pos = st.pop();
            nser[pos] = n;
        }
        
        //next smallest height to the left
        int[] nsel = new int[n];
        for(int i = n-1; i >= 0; i--) {
            while(!st.isEmpty() && heights[i] < heights[st.peek()]) {
                nsel[st.pop()] = i;
            }
            st.push(i);
        }
        while(!st.isEmpty()) {
            nsel[st.pop()] = -1;
        }
        
        //find the maximum area
        int maxArea = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++) {
            int curArea = heights[i] * (nser[i] - nsel[i] -1);
            maxArea = Math.max(curArea, maxArea);
        }
        
        return maxArea;
    }
}
