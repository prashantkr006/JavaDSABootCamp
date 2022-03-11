package com.pepcoding;
import java.util.*;
public class AnyBase_Multiply {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int b = scn.nextInt();
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();

        int d = getProduct(b, n1, n2);
        System.out.println(d);
    }

    public static int getProduct(int b, int n1, int n2){


        int finalAns = 0;
        int p = 1;
        while(n2 > 0) {
            //it will pick one number from n2 for multiplying it with every digits of n1
            int d2 = n2 % 10;
            n2 /= 10;

            int carry = 0;
            int partialAns = 0;
            int i = 1;
            int temp = n1;
            while(temp > 0) {
                int d1 = temp % 10;
                temp /= 10;

                int d = d1 * d2 + carry;

                partialAns += (d % b) * i;
                carry = d / b;
                i *= 10;

            }
            //System.out.println(partialAns);
            finalAns = getSum(b, finalAns, partialAns * p);
            p *= 10;
        }
        return finalAns;
    }

    static int getSum(int b, int n1, int n2) {
        int c = 0;
        int sum = 0;
        int i = 1;
        while((n1 + n2 + c) > 0) {
            int d1 = n1 % 10;
            int d2 = n2 % 10;
            n1 /= 10;
            n2 /= 10;

            int d = d1 + d2 + c;
            c = d / b;
            d = d % b;

            sum += d * i;
            i *= 10;
        }
        return sum;
    }
}
