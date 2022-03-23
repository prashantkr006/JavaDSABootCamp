package Stack;
import java.util.*;

public class Balanced_Brackets {
    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
            String str = sc.nextLine();

            Stack<Character> st = new Stack<>();

            for(int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);

                if(st.isEmpty() && (ch == ']' || ch == '}' || ch == ')')){
                    System.out.println(false);
                    return;
                }

                if(ch == '(' || ch == '[' || ch == '{') {
                    st.push(ch);
                }

                else if(ch == ')' || ch == ']' || ch == '}') {
                    if(ch == ')' && st.peek() == '(')
                        st.pop();
                    else if(ch == ']' && st.peek() == '[')
                        st.pop();
                    else if(ch == '}' && st.peek() == '{')
                        st.pop();
                    else {
                        System.out.println(false);
                        return;
                    }
                }
                else continue;
            }

            if(!st.isEmpty()){
                System.out.println(false);
                return;
            }
            else {
                System.out.println(true);
            }
        }
    }
}
