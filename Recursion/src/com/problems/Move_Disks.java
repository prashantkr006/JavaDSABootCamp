package com.problems;

public class Move_Disks {
    public static void main(String[] args) {
        int n = 3;
        toh(n, 'S', 'H', 'D');
    }
    static void toh(int disks, char t1, char t2, char t3) {
        if(disks == 1) {
            System.out.println(disks + " from " + t1 + " -> " + t3);
            return;
        }
        toh(disks - 1, t1, t3, t2);
        System.out.println(disks + " from " + t1 + " -> " + t3);
        toh(disks -1, t2, t1, t3);
    }
}
