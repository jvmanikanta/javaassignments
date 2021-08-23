package com.training.demo;

public class TypecastingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=10, y=20;
		long a = x+y;
		System.out.println(a);
		int p = (int) a;
		float v = (float)12.4;
		System.out.println("sum"+(a+p+v));

	}

}
