package Stack;

import java.util.Arrays;
import java.util.Stack;

public class Test {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(arr));
        testStack(arr);
    }

    static void testStack(int[] arr) {
        Stack<Integer> st = new Stack<>();
        try{
            for(int i = 0; i < arr.length; i++) {
                st.push(arr[i]);
            }
            System.out.print("[");
            while(!st.isEmpty()){
                System.out.print(st.pop() + ", ");
            }
            System.out.print("]");
        }
        catch (Exception e) {

        }

    }
}
