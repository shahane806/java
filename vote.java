import java.io.*;
import java.util.Scanner;

public class vote
{
	public static void main(String[] args){
	int age;
	Scanner sc  = new Scanner(System.in);
	System.out.println("Enter Age");
	age = sc.nextInt();
	if(age>=18)
	{
	System.out.println("You can Vote!");
	}
	else
	{
	System.out.println("You cannot Vote!");
	}
}
}