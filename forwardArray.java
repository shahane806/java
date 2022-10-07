import java.io.*;
import java.util.Scanner;
//print array forward

public class forwardArray
{
	public static void main(String[] args)
	{	
		int [] num = new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array Elements");
		for(int i = 0;i<5;i++)
		{
			num[i] = sc.nextInt();
		}
		for(int e:num)
		{
			System.out.print(e+" ");
		}
	}
}