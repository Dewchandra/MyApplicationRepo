package com.dp.main;

public class Car  {
        int t=6;
	public void drive() {
		Engine engine = new Engine();
		 int status = engine.start();

		if (status >= 1) {
			System.out.println("Journey  Started ...");
		} else {
			System.out.println("Engine having some problem...");
		}
	}

}
