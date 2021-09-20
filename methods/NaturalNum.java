package methods;

public class NaturalNum {
    static int sumNaturalNum(int num){
        int sum = (num * ( num + 1)) / 2;

        return sum;
    }
    public static void main(String[] args) {

        System.out.println(sumNaturalNum(10));

    }
}
