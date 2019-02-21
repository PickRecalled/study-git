package com.pickrecalled;

public class App {
	public static void main(String[] args) {
		addMethod(20.0, 30.0, 40.0, 50.0);
		minusMethod(20.0, 30.0, 40.0, 50.0);
	}

	public static void addMethod(double... num) {
		double v = 0.0D;
		for (double n : num) {
			v += n;
		}
		System.out.println("num:" + v);
	}

	public static void minusMethod(double... num) {
		double v = 500.0D;
		for (double n : num) {
			v -= n;
		}
		System.out.println("num:" + v);
	}

}
