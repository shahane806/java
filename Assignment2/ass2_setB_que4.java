import java.io.*;
import java.util.Scanner;
import game.*;
public class ass2_setB_que4{

public static void main(String[] args)
{
	/*
		Write a package game which will hava 2 classes Indoor and Outdoor. 
		Use a function display to generate the 
		list of player for the specific game.
		Use the default and parametrized constructor;
	*/
	
	Indoor ind[] = new Indoor [4];
	Outdoor out[] = new Outdoor[4];
	String name;
	String type;
	int i,m;
	Scanner sc  = new Scanner(System.in);
	
	System.out.println("Enter PlayerName for Indoor Games");
	for( i = 0;i<4;i++)
	{
		System.out.println("Enter name");
		name=sc.nextLine();
		System.out.println("Enter Game name");
		type = sc.next()+sc.nextLine();
		ind[i] = new Indoor(name,type);
		
	}
	System.out.println("Enter PlayerName for Outdoor Games");
	for( i = 0;i<4;i++)
	{
		System.out.println("Enter name");
		name = sc.nextLine();
		System.out.println("Enter Game name");
		type = sc.next()+sc.nextLine();
		out[i] = new Outdoor(name,type);
	}
	while(true)
	{
		
	System.out.println("Enter 1 :  Indoor Game Data ");
	System.out.println("Enter 2 : Outdoor Game Data ");	
	System.out.println("Enter 3 : exit ");
	m = sc.nextInt();
	switch(m)
	{
		case 1 : 
		{
			System.out.println("Indoor Players");
	
			for( i = 0;i<4;i++)
			{
				ind[i].display();
			}
			
		}
		break;
		case 2 : 
		{
			System.out.println("Outdoor Players");
			for( i = 0;i<4;i++)
			{
				out[i].display();
			}
		}
		break;
		case 3 : 
			System.exit(0);
		break;
		default : System.out.println("Invalid Input");
	}
	}
	
}
}