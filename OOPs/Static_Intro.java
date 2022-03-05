package OOPs;
/*
Static -> Such properties that are not related to any object but common for all the objects of a class
          are known as static properties.
          for eg -> there is Class Human
          and Ram, Mohan, Prashant, Kunal these all are different examples of Human
          so age, name, salary, marital status these all will belong to each objects of the Human class and this can
          vary for all
          but Population will not belong to any object class but each instance will come under population so population
          will be property of Human class itselff.
 */
class Test{
    static int x = 10;
    int y = 20;
    void showData() {
        System.out.println(x+" "+y);
    }
}

public class Static_Intro {
    static class Human {

        static long population;
        int age;
        String name;
        double salary;
        boolean isMarried;
        Human(int age, String name, double salary, boolean isMarried) {
            this.age = age;
            this.name = name;
            this.salary = salary;
            this.isMarried = isMarried;
            Human.population +=1;
        }
        public Human() {
            Human.population +=1;
        }
    }



    public static void main(String[] args) {
        //System.out.println(Human.population);
        Static_Intro obj = new Static_Intro();
        obj.fun();

        Test t1 = new Test();
        t1.showData();
        t1.y = 100;
        Test.x = 30;
        Test t2 = new Test();
        t2.showData();
        t1.showData();
    }
    // how to access non static function inside the static main() function
    // for that we need to create an obj of Main class and then it can be called as a property of the object.
    void fun() {
        // some code
    }
}
