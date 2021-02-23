package com.maven.PipelineCC;

public class Calculator {
	public static void main(String[] args)
	{
		int a=1,b=2;
		add(a,b);
	subtract(a,b);
	}
	
	
	//no-args constructor
	public Calculator() {
	}
	/**
	* Sum method.
	*/
	public static int add(int a, int b) {
	return a + b;
	}
	/**
	* Subtract method.
	*/
	public static int subtract(int a, int b) {
	return a - b;
	}
}
