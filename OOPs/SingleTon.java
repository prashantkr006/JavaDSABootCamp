package OOPs;

public class SingleTon {
    private SingleTon() {
    }

    //creating instance inside the class
    private static SingleTon instance;

    //because private instance can't be called by members of outside of the class
    //create a function inside the class which will call the instance and that function will be called in the main

     public static SingleTon getInstance(){
         //check whether one instance is created or not
         if(instance == null)
             instance = new SingleTon();
         return instance;
     }
    public static void main(String[] args) {

         SingleTon.getInstance();
        SingleTon.getInstance();
        SingleTon.getInstance();
    }
}
