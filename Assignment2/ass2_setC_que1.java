import java.io.*;
import java.util.Scanner;
class Employee{
	private int id;
	private String name;
	static String department;
	private float salary;
	Employee(){department = "BCA";}
	Employee(int id,String name, float salary){
		this();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	class Manager{
		private float bonus;
		private float total;
		public static float n=0;
		Manager(float bonus){
			this.bonus = bonus;
			
			this.total=salary+bonus;
			if(n<this.total)
			{
				n=this.total;
				
			}
		}
		void display(){
		
		System.out.printf("\n%10s %20s %20s %10s %10s %10s",id,    name,       department ,     salary,      bonus,    total );
		}
		
		
		
		void max()
		{
			if(n==total)
			{
				System.out.println("\n\nDetails of Employee having MaxSalary\n");
				display();
			}
		}
	}
}


public class ass2_setC_que1{
	public static void main(String[] args)
	{
		/*
		Define a class Employee(id,name,department,salary)
		define default and parameterized constructor also overload the constructor create the inner class manager(bonus)
		define the accept and display in both the class
		create the n object of manager and display the details of manager having maximum salary
		sal = sal+bonus
		*/
		int id;
		float salary;
		String name;
		System.out.println("Enter how many Employee Details you want to enter");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Employee.Manager[] m = new Employee.Manager[n];
			
		System.out.println("Enter Details");
		for(int i = 0;i<n;i++)
		{
			System.out.print("Id : ");
			id = sc.nextInt();
			System.out.print("\nName : ");
			String n1 = sc.next();
			name = sc.nextLine();
			name = n1+name;
			System.out.print("\nSalary: ");
			salary = sc.nextFloat();
			System.out.print("\nBonus : ");
			int bonus = sc.nextInt();
			m[i] = new Employee(id,name,salary).new Manager(bonus);
		}
		System.out.println("Employee Details ");
		System.out.printf("%10s %20s %20s %10s %10s %10s","Id", "Name", "Department","salary","bonus","total");
		for(int i = 0;i<n;i++)
		{
		m[i].display();
		}
		for(int i = 0;i<n;i++)
		{
		m[i].max();
		}
		
	}
	
}