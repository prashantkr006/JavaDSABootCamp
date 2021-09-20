package methods;

public class FactorialNum {

    static void factorial(int num){
        int fact = 1;
        while(num > 1){
            fact = fact * num;
            num--;
        }
        System.out.println(fact);
    }
    public static void main(String[] args) {
        factorial(5);
    }
}
