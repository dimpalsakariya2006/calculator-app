package com.miit.calculatorapp.calculatorapp;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=1, y, z,sum,sub,mul,div;
		Scanner myObj = new Scanner(System.in);
	    while(x<5)
		{
		System.out.println("1-Addition");
		System.out.println("2-Substraction");
		System.out.println("3-Multiplication");
		System.out.println("4-Division");
		System.out.println("Select operation:");
		x = myObj.nextInt();
		System.out.println("Enter Number: ");
		y = myObj.nextInt();
		System.out.println("Enter Another Number");
		z = myObj.nextInt();
		switch(x)
		{
			case 1:
				sum = y + z;
				System.out.println("Addition is: " + sum);
				break;
			case 2:
				sub = y - z;
				System.out.println("Substraction is: " + sub);
				break;
			case 3:
				mul = y * z;
				System.out.println("Multiplication is: " + mul);
				break;
			case 4:
				div = y / z;
				System.out.println("Division is: " + div);
				break;
				}
		}

	}

}