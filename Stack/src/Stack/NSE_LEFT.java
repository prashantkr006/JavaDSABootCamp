package Stack;
import java.util.*;

public class NSE_LEFT {
    public static void main(String[] args) {
        try {
            try (Scanner sc = new Scanner(System.in)) {
                int n = sc.nextInt();
                int[] arr = new int[n];
                for(int i = 0; i < n; i++) {
                    arr[i] = sc.nextInt();
                }

                System.out.println(Arrays.toString(nsel(arr, n)));
            }

        } catch(Exception e) {

        }
    }
    static int[] nsel(int[] arr, int n) {
        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>();
        for(int i = n - 1; i >= 0; i--) {
            while(st.size() > 0 && arr[i] < arr[st.peek()]) {
                int pos = st.pop();
                ans[pos] = arr[i];
            }
            st.push(i);
        }
        while(st.size() > 0) {
            ans[st.pop()] = -1;
        }

        return ans;
    }
}
