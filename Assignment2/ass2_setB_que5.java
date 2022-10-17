import java.io.*;
import java.util.Scanner;
class student{
	private int rno;
	private String name;
	private float mark1,mark2;
	student(){}
	student(int r,String n,float m1,float m2){
		this.rno = r;
		this.name = n;
		this.mark1 = m1;
		this.mark2 = m2;
	}
	
	class result{
		private float total;
		private float percentage;
		result(){
		this.total = mark1+mark2;
		this.percentage = (total/200)*100;
		}
		void displayMarksheet(){
			
			System.out.println("Rno : "+rno+"\t\t"+"Name : "+name+"\t\t"+"Marks1 : "+mark1+"/100"+"   "+"Mark2  : "+"   "+mark2+"/100   "+" "+"Total : "+total+"/200 \t  "+"Percentage  :  " +percentage+"/100");
		}
				
	}
	
}
public class ass2_setB_que5{
	public static void main(String[] args)
	{
		/*
			Define class student(rno,name,mark1,mark2).
			Define result class(total,percentage) inside the student class
			Accept the student details and display the marksheet with 
			Rno , name, mark1,mark2,total,percentage.
			(Use innerClass concept)
		*/
		
		int roll,mark1,mark2;
		String name;
		Scanner sc = new Scanner(System.in);
		System.out.println("How many Student you want to enter");
		int n = sc.nextInt();
		
		student.result [] s = new student.result[n];
		for(int i = 0;i<n;i++)
		{
			System.out.print("Enter \nRollNo :  ");
			roll = sc.nextInt();
			System.out.print("\nName   :  ");
			name = sc.next()+sc.nextLine();
			System.out.print("\n Subject1 Marks : ");
			mark1 = sc.nextInt();
			System.out.print("\n Subject2 Marks : ");
			mark2 = sc.nextInt();
			s[i] = new student(roll,name,mark1,mark2).new result();
			
		}
		System.out.println("Student Marksheet\n\n");
		for(int i = 0;i<n;i++)
		{
			s[i].displayMarksheet();
		}
	}
}