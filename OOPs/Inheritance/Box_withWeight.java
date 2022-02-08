package com.prashant.OOP.Inheritance;

public class Box_withWeight extends Box {
    float weight;
     Box_withWeight() {
        this.weight = -1f;
    }
    Box_withWeight(int l, int b, int h, int w) {
         super(l,b,h);
         this.weight = w;
    }

    void printBoxDetails() {
        System.out.println(this.l+" "+this.b+" "+this.h+" "+this.weight);
    }
}

class MarketBox extends Box_withWeight {
    float price;
    MarketBox(){
        price = 4500f;
    }
}