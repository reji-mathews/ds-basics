package com.datastructure.tree;

public class Factorial {
    public static void main(String[] args) {
        //System.out.print("Answer is " + fact(4));
        System.out.print("Answer is " + add(4));
    }

    private static int fact(int i) {
        if(i == 1) {
            return 1;
        } else {
            return i * fact(i-1);
        }
    }

    private static int add(int i) {
        if(i == 1) {
            return 1;
        } else {
            return i + add(i-1);
        }
    }
}