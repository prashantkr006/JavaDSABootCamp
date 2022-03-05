package OOPs.Inheritance;

public class Inheritance_Intro {
    public static void main(String[] args) {
//        Box b1 = new Box(2,5,8);
//        b1.printBoxDetails();
//        Box b2 = new Box(b1);
//        b2.printBoxDetails();
//        Box cube = new Box(3);
//        cube.printBoxDetails();

        MarketBox mb = new MarketBox();
        System.out.println(mb.price);

    }
}

class Box{
    int l;
    int b;
    int h;

    //default value
    Box() {
        this.l = -1;
        this.b = -1;
        this.h = -1;
    }
    //cube
    Box(int side){
        this.l = side;
        this.b = side;
        this.h = side;
    }
    //box from old box
    Box(Box old) {
        this.l = old.l;
        this.b = old.b;
        this.h = old.h;
    }

    //cuboid
    Box(int l, int b, int h){
        this.l = l;
        this.b = b;
        this.h = h;
    }

    void printBoxDetails() {
        System.out.println(this.l+" "+this.b+" "+this.h);
    }

}
