package Stack;
import java.util.*;

public class StockSpan {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            System.out.println(Arrays.toString(findSpan(arr, n)));
        } catch (Exception e) {

        }
    }

    static int[] findSpan(int[] arr, int n) {
        int[] span = new int[n];
        Stack<Integer> st = new Stack<>();
        for(int i = n - 1; i >= 0; i--) {
            while(st.size() > 0 && arr[i] >= arr[st.peek()]) {
                int stockIdx = st.peek();
                span[stockIdx] = stockIdx - i;
                st.pop();
            }
            st.push(i);
        }
        while(!st.isEmpty()){
            span[st.pop()] = 1;
        }

        return span;
    }
}