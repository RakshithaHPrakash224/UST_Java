package com.ustglobal.java8features.Predicates;

import java.util.function.Function;

public class TestB {
public static void main(String[] args) {
	
	Function<Integer , Integer> f = i->i*i;
	
	int res = f.apply(10);
	System.out.println(res);
}
}
