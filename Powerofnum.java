package com.bridgelabz_Basic;

import com.Bridgelabz.utility.Utility;

import java.util.Scanner;

import com.Bridgelabz.utility.Utility;

public class Powerofnum {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number:");
        int num=scan.nextInt();
        System.out.println("Power of 2^"+num+" is: "+(Math.pow(2, num)));
        System.out.println();
        System.out.println("Power of 2 till"+num);
        
        for(int i=1;i<=num;i++)
        {
         	System.out.println("Power of 2^"+i+" is: "+(Math.pow(2, i)));	
        }
	}

	

}
