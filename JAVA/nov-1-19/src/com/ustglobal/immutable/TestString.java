package com.ustglobal.immutable;

public class TestString {
public static void main(String[] args) {
	MyString ms = new MyString(12 , "renu");
	System.out.println(ms.getName());
	System.out.println(ms.getRollNo());
	
	
	MyString ms1 = ms.changeContent(20, "naveen");
	System.out.println(ms1.getName());
	System.out.println(ms1.getRollNo());
}
}
