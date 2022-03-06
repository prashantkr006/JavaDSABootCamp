package Stack;

import java.util.Stack;

public class StackMethods {
    public static void main(String[] args) {
        String[] friends = {"Prashant", "Kunal", "Kaushal", "Gautam", "Aditya", "Amit", "Shikhar"};
        checkStackMethods(friends);
    }
    static void checkStackMethods(String[] str) {
        Stack<String > st = new Stack<>();

        for(int i = 0; i < str.length; i++) {
            st.push(str[i]);
        }
        //displays the last top element
        System.out.println("top element " + st.peek());
        //search element "Aditya"
        System.out.println("Aditya is in stack at position " + st.search("Aditya"));
        //check whether stack is empty or not
        System.out.println("true if empty false if not empty:   " + st.empty());
    }
}
