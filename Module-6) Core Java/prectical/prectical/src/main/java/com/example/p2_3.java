package com.example;

// 2.3) Demonstrate type casting (explicit and implicit).
public class p2_3 {
    public static void main(String[] args) {
        int a = 10;
        double b = a; 
        long l = a;  

        double c = 9.5;
        int d = (int) c; 
        float f = (float) c; 
        byte by = (byte) a;  

        System.out.println("Implicit (int → double): " + b);
        System.out.println("Implicit (int → long): " + l);
        System.out.println("Explicit (double → int): " + d);
        System.out.println("Explicit (double → float): " + f);
        System.out.println("Explicit (int → byte): " + by);
    }
}
