package com.ustglobal.customizeduncheckedexception;

public class TestAge {
public static void main(String[] args) {
	System.out.println("Main started");
	
	Validator v = new Validator();
	try {
		v.verify(20);
	}catch(InvalidAgeExcpetion ie) {
		System.out.println("exception occured");
	}
	v.verify(13);
	System.out.println("Main ended");
	
}
}
