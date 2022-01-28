package com.bridgelabz_Basic;

import com.Bridgelabz.utility.Utility;

import java.util.Scanner;

public class QuotientRemainder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter First number");
		int num1 = scan.nextInt();
		System.out.println("Enter Second number");
		int num2 = scan.nextInt();
		int result=Utility.Quotient(num1,num2);
		int result1=Utility.Remainder(num1,num2);
		System.out.println("The Quotient is: "+result);
		System.out.println("The Remainder is: "+result1);

	}

}
