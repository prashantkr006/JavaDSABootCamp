package Stack;
import java.util.*;

public class NSE_RIGHT {
    public static void main(String[] args) throws Exception {
        try {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            System.out.print(Arrays.toString(nser(arr, n)));
        } catch(Exception e) {
            System.out.print(e);
        }
        
    }

    static int[] nser(int[] arr, int n) {
        Stack<Integer> st = new Stack<>();
        int[] ans = new int[n];
        for(int i = 0; i < n; i++) {
            while(st.size() > 0 && arr[i] < arr[st.peek()]) {
                int pos = st.pop();
                ans[pos] = arr[i];
            }
            st.push(i);
        }
        while(st.size() > 0) {
            int pos = st.pop();
            ans[pos] = -1;

        }

        return ans;
    }
}
