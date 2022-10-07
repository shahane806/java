import java.io.*;
import java.util.Scanner;


public class ass2_setB_que3{

public static void main(String[] args)
{
	/*
	
	Write a java program that take input as a person 
	name in the format of first middle last name 
	and then print it in the form of last first 
	and middle, where in the middle name first character
	is capital
	*/
	Scanner sc = new Scanner(System.in);
	String fullName;
	String[] arr = new String[3];
	System.out.println("Enter your name in this pattern ' first middle and last'");
	fullName = sc.next()+sc.nextLine();
	arr = fullName.split(" ");
	
	System.out.println("Output in pattern last first middle");
	System.out.println(arr[2]+" "+arr[0].substring(0,1).toUpperCase()+arr[0].substring(1)+" "+arr[1]);
	
	
}
}