package com.ustglobal.exception.first;

public class TestG {
public static void main(String[] args) {
	System.out.println("Main started");
	
	PayTM p = new PayTM();
	
	try {
		p.book();
		
	}catch(ArithmeticException ae) {
		System.out.println("excepton caught in main");
	}finally {
		System.out.println("executing finally");
	}
	System.out.println("Main ended");
}
}
