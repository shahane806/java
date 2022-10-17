import java.io.*;
import java.util.Scanner;
class Vehicle{
	protected String Company;
	protected float price;
	public Vehicle(){
		this.Company = "Null";
		this.price = 0f;
	}
	public Vehicle(String c,float p)
	{
		this.Company = c;
		this.price = p;
	}
	
}
class LightMotorVehicle extends Vehicle{
	private float mileage;
	void acceptLMV(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Company : ");

		String c = sc.next()+sc.nextLine();
		Company = c;
		System.out.println("Enter Price   : ");
		
		float p = sc.nextFloat();
		price = p;
		System.out.println("Enter Mileage");
		float m = sc.nextFloat();
		this.mileage = m;
	}
	void displayLMV(){
		System.out.printf("%20s %20s %20s\n",Company,price,mileage);
	}
		
}
class HeavyMotorVehicle extends Vehicle{
	private float capacity_in_tons;
	void acceptHMV(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Company : ");

		String c = sc.next()+sc.nextLine();
		Company = c;
		System.out.println("Enter Price   : ");

		float p = sc.nextFloat();
		price = p;
		System.out.println("Enter Capacity :");
		float m = sc.nextFloat();
		this.capacity_in_tons = m;
		
		
		
	}
	void displayHMV(){
		System.out.printf("%20s %20s %20s\n",Company,price,capacity_in_tons);
		
	}

}
public class ass3_setB_que2{
	public static void main(String[] args)
	{
		
		/*
			Write a java program to create a super class Vehicle having members Company and price.
			Derive 2 different classes LightMotorVehicle (Member - mileage) and
			HeavyMotorVehicle(member - capacity-in-tons).
			Accept the information for n vehicles and display the information appropriate form.
			While taking data. ask the user about the type of vehicle first.
			
		*/
		while(true)
		{
			
		System.out.println("Enter 1 >> LightMotorVehicle");
		System.out.println("Enter 2 >> HeavyMotorVehicle");
		System.out.println("Enter 3 >> Exit");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		switch(n)
		{
			case 1 : 
			{
				System.out.println("How many vehicles infomation you want to enter");
				n = sc.nextInt();
				LightMotorVehicle l[] = new LightMotorVehicle[n];
				for(int i = 0;i<n;i++)
				{
					l[i] = new LightMotorVehicle();
					l[i].acceptLMV();
				}
				System.out.printf("%20s %20s %20s\n","Company","Price","Mileage");
				for(int i = 0;i<n;i++)
				{
					l[i].displayLMV();
				}
			}
			break;
			case 2 : 
			{
				
				System.out.println("How many vehicles infomation you want to enter");
				n = sc.nextInt();
				HeavyMotorVehicle h[] = new HeavyMotorVehicle[n];
				for(int i = 0;i<n;i++)
				{
					h[i] = new HeavyMotorVehicle();
					h[i].acceptHMV();
				}
				for(int i = 0;i<n;i++)
				{
					h[i].displayHMV();
				}
			}
			break;
			case 3: 
			{
					System.exit(0);
			}
			default:System.out.println("Invalid Input");
			break;
		}
		}
		
	}
}