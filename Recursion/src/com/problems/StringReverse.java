package com.problems;

public class StringReverse {
    public static void main(String[] args) {
        String str= "Prashant";
        System.out.println(reverseString(str));
    }

    public static String reverseString(String str) {
        StringBuilder mystr = new StringBuilder(str);
        reverse(mystr, 0, str.length()-1);
        return mystr.toString();
	}
    
    public static void reverse(StringBuilder str, int start, int end)
    {
        if(start > end)
            return;
        swap(str, start, end);
        reverse(str, start+=1, end-=1);
    }
    
    public static void swap(StringBuilder str, int i, int j)
    {
        char temp = str.charAt(i);
        str.setCharAt(i, str.charAt(j));
        str.setCharAt(j, temp);
    }
}
