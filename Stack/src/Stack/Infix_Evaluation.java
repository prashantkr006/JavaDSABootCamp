/*
--> There will be 4 types of expression
    (, ), operand, operators
--> all operators
    +, -, *, /, ^
    --> precedence
        -> ^
        -> *, /
        -> +. -
        --> If operators of same precedence comes in consecutive way, then count the one who came first.
 */
package Stack;
import java.io.*;
import java.util.*;

public class Infix_Evaluation {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String exp = br.readLine();

        Stack<Integer> operands = new Stack<>();
        Stack<Character> operators = new Stack<>();

        for(int i = 0; i < exp.length(); i++) {
            char ch = exp.charAt(i);
            if(Character.isDigit(ch)) {
                int num = Integer.parseInt(String.valueOf(ch));
                operands.push(num);
            }
            else if(ch == '(') {
                operators.push(ch);
            }
            else if(ch == ')') {
                while (operators.size() > 0 && operators.peek() != '(') {
                    char operator = operators.pop();
                    int second_operand = operands.pop();
                    int first_operand = operands.pop();
                    int calculation = doOperations(first_operand, second_operand, operator);
                    operands.push(calculation);
                }
                if (operators.peek() == '(')
                    operators.pop();
            }
            else if(ch == '+' || ch == '-' || ch == '*' || ch == '/') {
                    while (operators.size() > 0 && (operators.peek() != '(' && !isPrecedenceHigh(ch, operators.peek()))) {
                        char operator = operators.pop();
                        int second_operand = operands.pop();
                        int first_operand = operands.pop();
                        int calculation = doOperations(first_operand, second_operand, operator);
                        operands.push(calculation);
                    }
                operators.push(ch);
            }
        }
        while (!operators.isEmpty()) {
            char operator = operators.pop();
            int second_operand = operands.pop();
            int first_operand = operands.pop();
            int calculation = doOperations(first_operand, second_operand, operator);
            operands.push(calculation);
        }
        int ans = operands.pop();
        System.out.println(ans);
    }

    static int doOperations(int n1, int n2, char operator) {
        if (operator == '+')
        {
            return n1 + n2;
        } else if (operator == '-')
        {
            return n1 - n2;
        } else if (operator == '*')
        {
            return n1 * n2;
        } else
        {
            return n1 / n2;
        }
    }

    static boolean isPrecedenceHigh(char operator1, char operator2) {
        if((operator1 == '*' || operator1 == '/') && (operator2 == '+' || operator2 == '-'))
            return true;
        else return false;
    }
}
