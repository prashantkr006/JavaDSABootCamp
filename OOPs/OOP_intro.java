package OOPs;

public class OOP_intro {
    public static void main(String[] args) {
        Student S1 = new Student();
        Student S2 = new Student(S1);
        System.out.println(S2.rollNo);
    }
}

class Student{
    int rollNo;
    int age;
    float marks;
    String name = "student";

    void greeting() {
        System.out.println("hello my name is " + name);
    }

    Student() {
        this.rollNo = 20;
        this.age = 21;
        this.name = "Prashant Kumar";
        this.marks = 7.64f;
    }

    //constructor which take vaue from another object
    Student(Student other) {
        this.name = other.name;
        this.age = other.age;
    }
}
