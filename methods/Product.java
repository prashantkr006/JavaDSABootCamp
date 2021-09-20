package methods;

import java.util.Scanner;

public class Product {

    static  int productNum(int num1, int num2){
        int product = num1 * num2;
        return  product;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(productNum(a, b));
    }
}
