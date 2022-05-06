package com.intermediate.PredicatePgm;

import java.util.function.Predicate;

public class PredicatePgm {
	public static void main(String[] args) {
		Predicate<Integer> predi=(r)->r>100;
		boolean u=predi.test(20);
		System.out.println(u);
	}

}
