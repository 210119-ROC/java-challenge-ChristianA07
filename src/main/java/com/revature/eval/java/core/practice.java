package com.revature.eval.java.core;

public class practice 
{

	public static void main(String[] args) 
	{
		areEqualByThreeDecimalPlaces(0, 0);
	}
	
	
	public static boolean areEqualByThreeDecimalPlaces(double firstNum, double secondNum) 
	{
		 int a = (int) firstNum * 1000;
	     int b = (int) secondNum * 1000;
	     
		if (a == b) 
		{
			System.out.println(true);
			return true;
		}
		else 
		{
			System.out.println(false);
			return false;
		}
	}
}

