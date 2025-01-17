package com.lambda.mainA;


/**
 * 
 * @author nikhil
 * The objective of this example is to how a lambda expression is created and called
 *
 */
//It is a functional interface as it has only one abstract method
interface MyNumber{
	double getValue();
}

public class LambdaDemo {
	public static void main(String args[]) {
		// we have defined declared a variable of type MyNumber
		MyNumber myNum;
		myNum = ()-> 123.33; // Defining a lambda function to return 123.33 on call. 
		System.out.println("A fixed value will be returned which is "+myNum.getValue());
		
		myNum = ()-> Math.random()*100; // Re defining a lambda function to return a number of type double on call
		System.out.println("A random number will be returned of type "+myNum.getValue());
	}
}
