public class Main {
    public static void main(String[] args) {
        System.out.println(sum(10));
        
    }
    static int sum(int n) {
        if (n == 0)
            return n;
        
        return n + sum(n - 1);
    }
    
}
