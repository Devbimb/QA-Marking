package org;
/*
 * @author
 * Upasana
 */
import java.util.Scanner;

public class Calculator {
	int x; 
	int y;
	
	/*
	 * this adds two numbers
	 * @param int
	 * @param  int
	 * @return int
	 * */
		
	public int plus()
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter first no.");
		System.out.println("  ");
		x=scn.nextInt();
		System.out.println("  ");
		System.out.println("Enter second number");
		System.out.println("  ");
		y=scn.nextInt();
		System.out.println("  ");
		return x+y;
	}
	public int minus()
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter first no.");
		System.out.println("  ");
		x=scn.nextInt();
		System.out.println("  ");
		System.out.println("Enter second number");
		System.out.println("  ");
		y=scn.nextInt();
		System.out.println("  ");
		return x-y;
	}	
	public int division()
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter first no.");
		System.out.println("  ");
		x=scn.nextInt();
		System.out.println("  ");
		System.out.println("Enter second number");
		System.out.println("  ");
		y = scn.nextInt(); 
		if(y != 0){               
		System.out.println(x / y);    
		System.out.println("  ");
		} else {
			System.out.println("  ");
			System.out.println("You enter wrong input");  
			System.out.println("Cannot divide by zero. Please try again.");
			System.out.println("------------------------------");
			System.out.println("Enter second number again"); 
			System.out.println("  ");
			y = scn.nextInt(); 
			System.out.println("  ");
		} return x/y;
	}
	public int multiply()
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter first no.");
		System.out.println("  ");
		x=scn.nextInt();
		System.out.println("  ");
		System.out.println("Enter second number");
		System.out.println("  ");
		y=scn.nextInt();
		System.out.println("  ");
		return x*y;
	}
	public int exit()
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("  ");
		System.out.println("Bye");
//		x=scn.nextInt();
//		System.out.println("Enter second number");
//		y=scn.nextInt();
		return x;
				
	}
}
