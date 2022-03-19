package Stack;
import java.util.*;

public class NGE_LEFT {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            System.out.println(Arrays.toString(NGEL(arr, n)));

        } catch( Exception e) {
            System.out.println(e);
        }
    }

    static int[] NGEL(int[] arr, int n) {
        Stack<Integer> st = new Stack<>();
        int[] ans = new int[n];

        for(int i = n - 1; i >= 0; i--) {
            while(st.size() > 0 && arr[i] > arr[st.peek()]) {
                int pos = st.pop();
                ans[pos] = arr[i];
            }
            st.push(i);
        }

        while(st.size() > 0) {
            ans[st.peek()] = -1;
            st.pop();
        }

        return ans;
    }
    
}
