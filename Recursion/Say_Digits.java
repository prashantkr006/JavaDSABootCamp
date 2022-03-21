public class Say_Digits {
    public static void main(String[] args) {
        digits(423);
        
    }
    public static void digits(int n) {
        if(n == 0)
            return;

        int num = n % 10;
        digits(n / 10);
        switch(num)
         {
            case 0:
                System.out.println("zero");
                return;
            case 1:
                System.out.println("one");
                return;
            case 2:
                System.out.println("two");
                return;
            case 3:
                System.out.println("three");
                return;
            case 4:
                System.out.println("four");
                return;
            case 5:
                System.out.println("five");
                return;
            case 6:
                System.out.println("six");
                return;
            case 7:
                System.out.println("seven");
                return;
            case 8:
                System.out.println("eight");
                return;
            case 9:
                System.out.println("nine");
                return;

         }
    }
}
