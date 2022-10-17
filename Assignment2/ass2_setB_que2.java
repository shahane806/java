import java.io.*;
import java.util.Scanner;
import SY.SYMarks;
import TY.TYMarks;
class Student{
	/*
		
		Write a java program to create a Package 'SY' which has a class
		SY Marks(members-ComputerTotal, MathsTotal, and ElectronicsTotal).
		Create another package TY which has a class TY Marks
		(members-theory , practicals).
		Create n objects of Student class(having rollNumber, name, SYMarks and TYMarks).
		Add the marks of SY and TY computer subjects and calculate
		Grade('A' for >= 70,'B' >= 60, 'C' for >= 50, Pass Class for >= 40 else "Fail")
		and display the result of the student in proper formatl
		
		*/
	private int rollNo;
	private String name;
	private int Symarks;
	private int Tymarks;
	private int Total;
	public void getDetails(int roll,String n,int sy,int ty)
	{
		this.rollNo = roll;
		this.name =n;
		this.Symarks = sy;
		this.Tymarks = ty;
	}
	public void displayDetails()
	{
		System.out.println("Roll No : "+this.rollNo);
		System.out.println("Name    : "+this.name);
		System.out.println("SY Marks : "+this.Symarks);
		System.out.println("TY Marks : "+this.Tymarks);
	}
	public void calculateGrade(){
		this.Total = this.Symarks + this.Tymarks;
		System.out.print("Grade : ");
		if(this.Total>=70)
		{
			System.out.print("  :  A\n");
		}
		else if(this.Total>=60)
		{
			System.out.print("  :  B\n");
		}
		else if(this.Total>=50)
		{
			System.out.print("  :  C\n");
		}
		else if(this.Total>=40)
		{
			System.out.print("  :  Pass\n");
		}
		else 
		{
			System.out.print("  :  Fail\n");
		}
	}
	
}
public class ass2_setB_que2{
	public static void main(String[] args)
	
	{
		 	 
		SYMarks syMarksObj = new SYMarks();
		TYMarks tyMarksObj = new TYMarks();
		System.out.println("Enter how many student details you want to enter");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int roll,syMark,tyMark;
		String name;
		Student[] stud = new Student[n];
		System.out.println("Enter student details");
		for(int i = 0;i<n;i++)
		{
			
		    stud[i] = new Student();
			
			System.out.print("\nRoll No : ");
			roll = sc.nextInt();
			System.out.print(" Name : ");
			name = sc.next()+sc.nextLine();
			
			
			System.out.println("Enter SY Marks");
			System.out.print("Subjects : Computer , Math , Electronics (outof 100) : ");
			int c,m,e;
			
			c = sc.nextInt();
			m = sc.nextInt();
			e = sc.nextInt();
			
			System.out.println("Enter TY Marks");
			System.out.print("Subjects : Theory , Practical  : ");
			int t,p;
			
			
			t = sc.nextInt();
			p = sc.nextInt();
			
			
			
			syMarksObj.getMarks( c, m,  e);
			tyMarksObj.getMarks( t, p);
			
			stud[i].getDetails(roll,name,syMarksObj.getSyComputerTotalMarks(),tyMarksObj.getTyComputerTotalMarks());
		
		}
		for(int i = 0 ; i<n;i++)
		{
			
			stud[i].displayDetails();
			stud[i].calculateGrade();
		}
		
	}
	
}