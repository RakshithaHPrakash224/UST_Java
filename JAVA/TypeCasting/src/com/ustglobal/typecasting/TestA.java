package com.ustglobal.typecasting;

public class TestA {
public static void main(String[] args) {
	byte a = 10;
	int b = a;  // Implicit casting
	System.out.println("b is" +b);
	int p = 20;
	double q = p;
	System.out.println("q is" +q);
	double x = 20.67;
	int y = (int) x;
	System.out.println("y is "+y);
	byte z =(byte) x;
	System.out.println("z is" +z);
	char r = (char) x;
	System.out.println("r is"+r);
}
}
