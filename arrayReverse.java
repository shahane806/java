import java.io.*;
import java.util.Scanner;
public class arrayReverse
{
	public static void main(String[] args)
	{
		int []num = new int[5];
		int temp;
int i;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter array Elements");
		for( i = 0;i<num.length;i++)
		{
			num[i] = sc.nextInt();
		}
		for( i = 0;i<(num.length)/2;i++)
		{
			temp = num[i];
			num[i] = num[num.length-1-i];
			 num[num.length-1-i] = temp;
		}
		for(int e=0;e<num.length;e++)
		{
			System.out.print(num[e]+" ");
		}
	}
}