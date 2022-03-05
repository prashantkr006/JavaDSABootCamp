package methods;

public class MinMax {

    static  int minNum(int a, int b, int c){
        int min = Math.min(Math.min(a, b), c);
        return  min;
    }

    static int maxNum(int a, int b, int c){
        int max = Math.max(Math.min(a, b), c);
        return max;
    }
    public static void main(String[] args) {
        int a = 10, b = 3, c = 19;

        System.out.println("minimum is "+minNum(a, b, c));
        System.out.println("maximum is "+maxNum(a ,b, c));
    }
}
