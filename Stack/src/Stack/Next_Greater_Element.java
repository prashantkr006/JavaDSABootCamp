package Stack;
import java.io.*;
import java.util.*;

public class Next_Greater_Element{
    public static void display(int[] a){
        StringBuilder sb = new StringBuilder();

        for(int val: a){
            sb.append(val + "\n");
        }
        System.out.println(sb);
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = Integer.parseInt(br.readLine());
        }

        int[] nge = solve(a);
        display(nge);
    }

    public static int[] solve(int[] arr){
        // solve
        int ans[] = new int[arr.length];
        Stack<Integer> st = new Stack<>();

        //last value of array has no greater element at right side
        st.push(arr[arr.length - 1]);
        ans[ans.length - 1] = -1;

        for(int i = arr.length - 2; i >= 0; i--) {
            if(arr[i] < st.peek()) {
                ans[i] = st.peek();
                st.push(arr[i]);
            }
            else {
                while(st.peek() <= arr[i]  && st.size() >= 1) {
                    st.pop();
                }
                if(st.isEmpty()) {
                    ans[i] = -1;
                }
                else {
                    ans[i] = st.peek();
                }
            }
        }

        return ans;
    }

}