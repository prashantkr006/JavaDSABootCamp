package Arrays;

import java.util.*;

public class Items_Matching_aRule {
    public static void main(String[] args) {

        List<List<String>> list = new ArrayList<>();

        ArrayList<String> newList = new ArrayList<>();
        newList.add("phone");
        newList.add("blue");
        newList.add("pixel");
        list.add(newList);

        ArrayList<String> newList1 = new ArrayList<>();
        newList1.add("computer");
        newList1.add("silver");
        newList1.add("pixel");
        list.add(newList1);

        ArrayList<String> newList2 = new ArrayList<>();
        newList2.add("phone");
        newList2.add("gold");
        newList2.add("iphone");
        list.add(newList2);
        System.out.println(list);
        System.out.println(countMatches(list,"type","phone"));
    }
    static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count = 0;
        if(ruleKey.equals("type")){
            for(int i = 0; i < items.size(); i++) {
                if(items.get(i).get(0).equals(ruleValue))
                    count+=1;
            }
        }
        if(ruleKey.equals("color")){
            for(int i = 0; i < items.size(); i++) {
                if(items.get(i).get(1).equals(ruleValue))
                    count+=1;
            }
        }
        else {
            for(int i = 0; i < items.size(); i++) {
                if(items.get(i).get(2).equals(ruleValue))
                    count+=1;
            }
        }
        return count;
    }
}
