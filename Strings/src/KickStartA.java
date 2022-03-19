import java.util.*;
import java.util.Map.Entry;
public class KickStartA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 1; i <= t; i++) {
            String I = sc.next();
            String P = sc.next();
            System.out.print("Case #" + i + ": ");
            int val = searchExtraLetter(I, P);
            System.out.print(val == -1 ? "IMPOSSIBLE" : val);
            System.out.println();
        }
    }

    public static int searchExtraLetter(String I, String P) {
        HashMap<Character, Integer> hm = new HashMap<>(); //map of characters given
        //This loop will fill hashmap with the number of occurences of character in String I
        for(int i = 0; i < I.length(); i++) {

            char ch = I.charAt(i);
            if(hm.containsKey(ch)){
                int a = hm.get(ch);
                a += 1;
                hm.put(ch, a);
            }
            else {
                hm.put(ch, 1);
            }
        }

        //now we need to check if char of string I, present and <= occurence of char of P
        HashMap<Character, Integer> hp = new HashMap<>(); //Map of characters typed
        for(int i = 0; i < P.length(); i++) {

            char ch = P.charAt(i);
            if(hp.containsKey(ch)){
                int a = hm.get(ch);
                a += 1;
                hp.put(ch, a);
            }
            else {
                hp.put(ch, 1);
            }
        }
        //check if there's any extra character given which is missed in typing
        if(!hm.keySet().equals(hp.keySet())) {
            return -1;
        }

        for(Entry<Character, Integer> entry : hm.entrySet()) {
            char ch = entry.getKey();
            if(hp.containsKey(ch)) {
                if(hp.get(ch) >= hm.get(ch)) {
                    return hp.get(ch) - hm.get(ch);
                }
                else return -1;
            }
            else {
                return -1;
            }
        }
        return -1;
    }
}
