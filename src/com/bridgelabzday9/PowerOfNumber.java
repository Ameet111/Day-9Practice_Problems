package com.bridgelabzday9;

import java.util.Scanner;  

public class PowerOfNumber {
	
	static int power(int base, int exponent)
	
	{  
		
	int power = 1;  
	//increment the value of i after each iteration until the condition becomes false  
	for (int i = 1; i <= exponent; i++)   
	//calculates power  
	power = power * base;  
	//returns power  
	return power; 
	
	}  
	
	//driver code  
	public static void main(String args[]) 
	
	{  
		
	int base, exponent;  
	Scanner sc=new Scanner(System.in);  
	System.out.print("Enter the base: ");  
	base=sc.nextInt();  
	System.out.print("Enter the exponent: ");  
	exponent=sc.nextInt();  
	//calling function  
	int pow=power(base, exponent);  
	//prints the result  
	System.out.println(base +" to the power " +exponent + " is: "+pow);
	
	} 
	
	
}  


