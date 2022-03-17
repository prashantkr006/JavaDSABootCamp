package Stack;
import java.io.*;
import java.util.Stack;

public class INFIX_TO_POSTFIX {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String exp = br.readLine();
        toPOSTFIX(exp);
    }

    static void toPOSTFIX(String expression) {
        //traverse in the expression
        Stack<String> postFixStack = new Stack<>();
        Stack<String> operators = new Stack<>();

        for(int i = 0; i < expression.length(); i++) {
            String ch = String.valueOf(expression.charAt(i));
            if(ch == "(")
            {
                operators.push(ch);
            }
            else if(ch == ")")
            {
                while(operators.size() > 0 && operators.peek() != "(")
                {
                    String operator = operators.pop();
                    String value2 = postFixStack.pop();
                    String value1 = postFixStack.pop();
                    String postValue = value1 + value2 + operator;
                    postFixStack.push(postValue);
                }
                operators.pop();
            }
            else if(ch == "+" || ch == "-" || ch == "*" || ch == "/")
            {
                while (operators.size() > 0 && operators.peek() != "(" && !isHighPrecedence(ch, operators.peek()))
                {
                    String operator = operators.pop();
                    String value2 = postFixStack.pop();
                    String value1 = postFixStack.pop();
                    String postValue = value1 + value2 + operator;
                    postFixStack.push(postValue);
                }
                operators.push(ch);
            }
            else
            {
                postFixStack.push(String.valueOf(ch));
            }
        }
        while (!operators.isEmpty())
        {
            String operator = operators.pop();
            String value2 = postFixStack.pop();
            String value1 = postFixStack.pop();
            String postValue = value1 + value2 + operator;
            postFixStack.push(postValue);
        }
        String ans = postFixStack.pop();
        System.out.println(ans);
    }

    static boolean isHighPrecedence(String op1, String op2)
    {
        if(op1 == "*" || op1 == "/" && op2 == "+" || op2 == "-")
        {
            return true;
        }
        else
            return false;
    }
}
