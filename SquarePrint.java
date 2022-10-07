import java.io.*;
import java.util.Scanner;
public class SquarePrint
{
	public static void main(String[] args)
	{
		int i,j;
		int num;
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		for(i = 0;i<num;i++)
		{for(j = 0;j<num;j++)
		{
			System.out.print(" * ");
		}	
		System.out.print("\n");
	}
	}
}