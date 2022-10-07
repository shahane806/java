
import java.io.*;
import Series.*;
import java.util.Scanner;
//import Series.sq_num;
public class ass2_setB_que1{
	public static void main(String[] args)
	
	{
		/*
		Create a package named Series having three different classes to print series:
		a. Prime numbers
		b. Fibonacci series
		c. Square of numbers 
		Write a program to generate 'n' terms of above series
		*/
		System.out.println("Hello");
		primeNumber pn = new primeNumber();
		fibonacci_series fb = new fibonacci_series();
		Scanner sc = new Scanner(System.in);
		int n1;
		snum sm = new snum();
		
		System.out.println("Enter n for fibo");
		n1 = sc.nextInt();
		fb.fibo(n1);
		System.out.println("\nEnter n for square");
		n1 = sc.nextInt();
		sm.sq(n1);
		System.out.println("Enter n for primeNumber");
		n1 = sc.nex tInt();
		System.out.println("Output for PrimeNumber");
		for(int i = 2;i<=n1;i++)
		{
			
			if(1==pn.primeN(i))
			{
				System.out.print(i+" ");
			}
		}
	}
}