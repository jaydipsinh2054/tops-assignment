package com.example;

//11.2) Demonstrate the use of different access modifiers within the same package and across different packages.
public class p11_2 {
	//javac -d . pack1/AccessDemo.java
	//javac -d . pack1/SamePackage.java
	//javac -d . pack2/DifferentPackage.java

	//java pack1.SamePackage
	//java pack2.DifferentPackage

	//Output

	//For SamePackage:
	//Inside pack1.AccessDemo
	//Public Variable
	//Protected Variable
	//Default Variable
	//Private Variable
	//Public Variable
	//Protected Variable
	//Default Variable

	//For DifferentPackage:
	//Public Variable
}
