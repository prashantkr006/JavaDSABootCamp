package methods;
import java.util.*;


public class SumNum {

    static int sum(int num1, int num2){
        int sum = num1 + num2;
        return sum;
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();
            System.out.println(sum(num1, num2));
        }
    }
}
