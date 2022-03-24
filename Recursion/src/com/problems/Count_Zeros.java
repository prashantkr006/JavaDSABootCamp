package com.problems;

public class Count_Zeros {
    public static void main(String[] args) {
        long num = 0203;
        System.out.println(countZero(num, 0));
    }

    public static int countZero(long num, int count) 
    {
        if(num == 0)
            return count;
        if(num % 10 == 0)
            return countZero(num / 10, count+1);

        else return countZero(num / 10, count);
    }
}