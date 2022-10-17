import java.io.*;
import java.util.Scanner;
abstract class staff{
	protected String name,address;
}
class FullTimeStaff extends staff{
		private String department;
		private float salary;
		FullTimeStaff(){
			name = "NULL";
			address = "NULL";
			this.department = "NULL";
			this.salary = 0f;
		}
		FullTimeStaff(String n,String a,String d,float s){
			name = n;
			address = a;
			this.department = d;
			this.salary = s;
		}
		void display(){
			System.out.printf("%20s %20s %20s %20s\n",name,address,this.department,this.salary);
			
		}
}
class PartTimeStaff extends staff{
	private float num_of_hours,rate_perhour;
	PartTimeStaff(){
		name = "NULL";
		address = "NULL";
		this.num_of_hours = 0f;
		this.rate_perhour = 0f;
	}
	PartTimeStaff(String n1,String a1,float noh,float rph)
	{
		name = n1;
		address = a1;
		this.num_of_hours = noh;
		this.rate_perhour = rph;
	}
	void display(){
			System.out.printf("%20s %20s %20s %20s\n",name,address,this.num_of_hours,this.rate_perhour);
			
		}
}

public class ass3_setB_que1{
	public static void main(String[] args)
	{
		/*
			Define an abstract class "staff" with members name and address. 
			Define two sub-classes of this class - "FullTimeStaff" (department , salary) and "PartTimeStaff"(number-of-hours, rate-perhour).
			Define appropriate constructors. 
			Create n objects which could be either FullTimeStaff for PartTimeStaff class by asking the user's choice.
			Display details of all "FullTimeStaff" objects and all "PartTimeStaff" objects.
			
		*/
		System.out.println("Enter How many members you want to enter");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		FullTimeStaff f[] = new FullTimeStaff[n];
		
		PartTimeStaff p[] = new PartTimeStaff[n];
		String name,a,d;
		float s,noh,rph;
		while(true)
		{
		
		System.out.println("Enter 1 >> Input Data for Full Time Staff");
		System.out.println("Enter 2 >> Input Data for Part Time Staff");
		System.out.println("Enter 3 >> Display All FullTime");
		System.out.println("Enter 4 >> Display All PartTime");
		System.out.println("Enter 5 >> EXIT");
		int cho = sc.nextInt();
		switch(cho)
		{
			case 1: {
				
				for(int i = 0;i<n;i++)
				{
					System.out.print("Enter Name : ");
					name = sc.next()+sc.nextLine();
					System.out.print("\nEnter Address : ");
					a = sc.next()+sc.nextLine();
					System.out.print("\nEnter Department : ");
					d = sc.next()+sc.nextLine();
					System.out.print("\nEnter Salary : ");
					s = sc.nextFloat();
					f[i] = new FullTimeStaff(name,a,d,s);
					
				}
				System.out.printf("%20s %20s %20s %20s\n","Name","Address","Department","Salary");
				for(int i = 0;i<n;i++)
				{
					f[i].display();
				}
				
			}
			break;
			case 2: {
				for(int i = 0;i<n;i++)
				{
					System.out.print("Enter Name : ");
					name = sc.next()+sc.nextLine();
					System.out.print("\nEnter Address : ");
					a = sc.next()+sc.nextLine();
					System.out.print("\nEnter num_of_hours : ");
					noh = sc.nextFloat();
					System.out.print("\nEnter rate-perhours : ");
					rph = sc.nextFloat();
					p[i] = new PartTimeStaff(name,a,noh,rph);
					
				}

				
			}
			break;
			case 3:{
				System.out.printf("%20s %20s %20s %20s\n","Name","Address","Department","Salary");
				for(int i = 0;i<n;i++)
				{
					
					f[i].display();
				}
				
			}
			break;
			case 4:{
				System.out.printf("%20s %20s %20s %20s\n","Name","Address","Number of hours","Rate_per_hours");
				for(int i = 0;i<n;i++)
				{
					p[i].display();
				}
			}
			break;
			case 5:{
				System.exit(0);
			}
			default:System.out.println("Invalid Input");
			break;
		}
			
		}
	}
}