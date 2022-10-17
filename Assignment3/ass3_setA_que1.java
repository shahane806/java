 import java.io.*;
 import java.util.Scanner;
 class Employee{
	 private int id;
	 private String name,department;
	 private float salary;
	 Employee(){
		 this.id = 0;
		 this.name = "NULL";
		 this.department = "NULL";
		 this.salary = 0f;
	 }
	 Employee(int i,String n,String dep,float s)
	 {
		 this.id = i;
		 this.name = n;
		 this.department = dep;
		 this.salary = s;
	 }
	 void accept(){
		 Scanner sc = new Scanner(System.in);
		 System.out.print("Enter Id : ");
		 this.id = sc.nextInt();
		 System.out.print("\nEnter Name : ");
		 this.name = sc.next()+sc.nextLine();
		 System.out.print("\nEnter Department : ");
		 this.department = sc.nextLine();
		 System.out.print("\nEnter Salary  : ");
		 this.salary = sc.nextFloat();
		 
		 
	 }
	 
	 void display(){
		 System.out.printf("\n%20s %20s %20s %20s",id,name,department,salary);
	 }
	 float getSalary(){
		 return this.salary;
	 }
 }
 class Manager extends Employee
 {
	 private float bonus;
	 private float totalSalary;
	 public static float max=0f;
	 Manager(){
		 this.bonus = 0f;
		 this.totalSalary = 0f;
	 }
	 Manager(float b)
	 {
		 this.bonus = b;
		 this.totalSalary = super.getSalary()+b;
	 }
	 void acceptM(){
		
		 super.accept();
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter Bonus : ");
		 this.bonus = sc.nextFloat();
		 this.totalSalary = this.bonus + super.getSalary();
		 if(max < this.totalSalary)
		 {
			 max = this.totalSalary;
		 }
		 
		
		 
	 }
	 void displayM(){
		 super.display();
		 System.out.printf("%10s  %10s",this.bonus,this.totalSalary);
		
	 }
	 void maxSalary(){
		 if(max == this.totalSalary)
		 {
			 System.out.print("\nMaximum Salary Employee");
			 displayM();
		 }
		 
		 
	 }
 }
 
 public class ass3_setA_que1
 {
	 public static void main(String[] args)
	 {
		 /*
			Define a class Employee having private members - id , name, department, salary.
			Define default and parameterized constructors. 
			Create a subclass called Manager with private member bonus.
			Define methods accept and display in both the classes. 
			Create n objects of Manager class and display the details of the manager having the maximum total salary(salary+bonus);
			
		 */
		 System.out.println("How many Employee Details you want to enter");
		 Scanner sc = new Scanner(System.in);
		 int n = sc.nextInt();
		 Manager m[] = new Manager[n];
		 System.out.println("Enter Details : ");
		 for(int i = 0;i<m.length;i++)
		 {
			 m[i] = new Manager();
			 m[i].acceptM();
		 }
		  System.out.printf("%20s %20s %20s %20s %10s %10s","Id","Name","Department","Salary","Bonus","TotalSalary");
		 for(int i = 0;i<m.length;i++)
		 {
			 m[i].displayM();
		 }
		for(int i = 0;i<m.length;i++)
		 {
			 m[i].maxSalary();
		 }
		
		 
		 
	 }
 }