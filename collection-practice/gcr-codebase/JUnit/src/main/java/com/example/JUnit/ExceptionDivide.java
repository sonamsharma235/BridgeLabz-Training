package com.example.JUnit;

public class ExceptionDivide {
   
	public static int divide(int a,int b) {
		if(b==0) {
			throw new ArithmeticException ("invalid input");
		}
		
		return a/b;
	}
}
