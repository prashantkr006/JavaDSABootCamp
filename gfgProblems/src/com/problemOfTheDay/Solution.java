package com.problemOfTheDay;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t > 0) {
                String str = sc.nextLine();
                System.out.println(reverseString(str));
                t--;
            }
        }catch (Exception e){
            System.out.println(e);
        }

    }
        public static String reverseString(String str) {
            StringBuilder sb = new StringBuilder(str);
            sb.reverse();
            return sb.toString();
        }
}