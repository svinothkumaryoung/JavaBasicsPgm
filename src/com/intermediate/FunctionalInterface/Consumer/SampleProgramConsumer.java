package com.intermediate.FunctionalInterface.Consumer;

import java.util.function.Consumer;

public class SampleProgramConsumer {
	public static void main(String[] args) {
		Consumer<String> c=(r)->{
			System.out.println(r);
		};
		Consumer<String> c1=(r)->{
			System.out.println(r.toUpperCase());
		};
		Consumer<String> c2=(r)->{
			System.out.println(r.toLowerCase());
		};
		c1.andThen(c).andThen(c2).accept("Vinoth");
	}

}
