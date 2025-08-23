package com.example.pack1;

public class AccessDemo {
	public String publicVar = "Public Variable";
    protected String protectedVar = "Protected Variable";
    String defaultVar = "Default Variable";  
    private String privateVar = "Private Variable";

    public void show() {
        System.out.println("Inside pack1.AccessDemo");
        System.out.println(publicVar);
        System.out.println(protectedVar);
        System.out.println(defaultVar);
        System.out.println(privateVar);
    }
}
