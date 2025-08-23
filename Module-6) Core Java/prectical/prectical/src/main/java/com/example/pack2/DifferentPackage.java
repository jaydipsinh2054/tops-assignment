package com.example.pack2;

import com.example.pack1.AccessDemo;

public class DifferentPackage {
    public static void main(String[] args) {
        AccessDemo obj = new AccessDemo();
        System.out.println(obj.publicVar);    
        // System.out.println(obj.protectedVar); // ❌ Not accessible
        // System.out.println(obj.defaultVar);   // ❌ Not accessible
        // System.out.println(obj.privateVar);   // ❌ Not accessible
    }
}
