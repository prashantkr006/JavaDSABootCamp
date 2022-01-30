package EasyProblems;

import java.util.*;

public class Add_to_Array {
    public static void main(String[] args) {
        int[] num = {2,1,5};
        int k = 806;
        System.out.println(addToArrayForm(num,k));
    }
    static public List<Integer> addToArrayForm(int[] num, int k) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i = num.length-1; i >= 0; i--){
            list.add(0, (num[i]+k) % 10);
            k = (num[i]+k) / 10;
        }
        if(k != 0)
            list.add(0,k);
        return list;
    }
}
