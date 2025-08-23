package com.example;

import java.util.Scanner;

// 3.3) Write a program to display the Fibonacci series using a loop.
public class p3_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter how many terms of Fibonacci series to display: ");
        int n = sc.nextInt();

        int a = 0, b = 1;

        System.out.print("Fibonacci Series: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            int c = a + b;
            a = b;
            b = c;
        }

        sc.close();
    }
}
