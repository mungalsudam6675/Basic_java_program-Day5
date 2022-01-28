package com.bridgelabz_Basic;

import com.Bridgelabz.utility.Utility;

import java.util.Scanner;


public class Harmonicnumber {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
	   	System.out.println("Enter a number: ");
		double num = scan.nextDouble();
    	double result=Utility.harmonicValue(num);
		
		if(num>0)
	 	{
			System.out.println("The Harmonic Value for the number is: "+result);
	 	}
		else
		{
			System.out.println("The number should be greater than zero");
		}
	}

}
