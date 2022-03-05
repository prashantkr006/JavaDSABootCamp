package methods;

public class CanVote {

    static void isVoter(int age){
        if(age >= 18)
            System.out.println("Eligible for vote");
        else
            System.out.println("Not eligble");
    }
    public static void main(String[] args) {
        isVoter(20);

    }
}
