package methods;

public class Pythagorean {
    static boolean isPythagoreanTriplet(int a, int b, int c){
        if((a * a + b * b) == c * c)
            return true;

        return false;
    }
    public static void main(String[] args) {
        System.out.println(isPythagoreanTriplet(3, 4, 5));
    }
}
