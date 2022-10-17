import java.util.Scanner;
import java.io.*;
import java.lang.Math;
abstract class Shape{
	abstract public float calc_area();
	abstract public float calc_volume();
	
}
class Sphere extends Shape{
	private float radius;
	Sphere(float r){
		this.radius = r;
	}
	public float calc_area(){
		return 4f*3.14f*(this.radius*this.radius);
	}
	public float calc_volume(){
		return (4/3)*(3.14f*this.radius*this.radius*this.radius);
	}
	public void display(){
		
		System.out.printf("\n\nThe Area of Sphere is : %10s\n",this.calc_area());
		System.out.printf("The Volume of Sphere is :%10s\n",this.calc_volume());
		System.out.println("");
		
	}
}
class Cone extends Shape{
	private float radius;
	private float height;
	Cone(float r,float h){
		this.radius = r;
		this.height = h;
	}
	public float calc_area(){
		return (float)(3.14f*this.radius*(this.radius+(float)Math.sqrt(this.height*this.height + this.radius * this.radius)));
	}
	public float calc_volume(){
		return 3.14f*(this.radius*this.radius)*(this.height/3f);
	}
	public void display(){
		
		System.out.printf("\n\nThe Area of Cone is : %10s\n",this.calc_area());
		System.out.printf("The Volume of Cone is :%10s\n",this.calc_volume());
		System.out.println("");
		
	}
}
class Cylinder extends Shape{
	private float radius;
	private float height;
	Cylinder(float r,float h){
		this.radius = r;
		this.height = h;
	}
	public float calc_area(){
		return (float)(2f*3.14f*this.radius*this.height)+(float)(2f*3.14f*this.radius*this.radius);
	}
	public float calc_volume(){
		return (float)(3.14f*this.radius*this.radius*this.height);
	}
	public void display(){
		
		System.out.printf("\n\nThe Area of Cylinder is : %10s\n",this.calc_area());
		System.out.printf("The Volume of Cylinder is :%10s\n",this.calc_volume());
		System.out.println("");
		
	}
}
class Box extends Shape{
	private float length;
	private float breadth;
	private float height;
	Box(float l,float b,float h){
		this.length = l;
		this.breadth = b;
		this.height = h;
	}
	public float calc_area(){
		return (float)(2f*this.length*this.breadth)+(float)(2f*this.length*this.height)+(float)(2f*this.breadth*this.height);
	}
	public float calc_volume(){
		return (float)(this.length*this.breadth*this.height);
	}
	public void display(){
		
		System.out.printf("\n\nThe Area of Box is : %10s\n",this.calc_area());
		System.out.printf("The Volume of Box is :%10s\n",this.calc_volume());
		System.out.println("");
		
	}
}
public class ass3_setA_que2{

	public static void main(String[] args)
	{
		/*
			Create an abstract class Shape with methods calc_area and calc_volume.
			Derive four classes
			Sphere(radius),
			Cone(radius,height)and 
			Cylinder(radius,height),
			Box(langth,breadth,height) from it.
			Calculate area and volume of all. (Use Method overriding);
		*/
		while(true){
		System.out.println("Calculate Area and Volume of Following ");
		System.out.println("Enter 1. Sphere");
		System.out.println("Enter 2. Cone");
		System.out.println("Enter 3. Cylinder");
		System.out.println("Enter 4. Box");
		System.out.println("Enter 5. Exit");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		switch(n)
		{
			case 1 : 
			{
				System.out.print("\n\nEnter Radius : ");
				float r = sc.nextFloat();
				Sphere s = new Sphere(r);
				s.display();
			}
			break;
			case 2 : 
			{
				System.out.print("\n\nEnter radius : ");
				float r = sc.nextFloat();
				System.out.print("\nEnter height: ");
				float h = sc.nextFloat();
				Cone c = new Cone(r,h);
				c.display();
			}
			break;
			case 3 : 
			{
				System.out.print("\n\nEnter radius : ");
				float r = sc.nextFloat();
				System.out.print("\nEnter height: ");
				float h = sc.nextFloat();
				Cylinder c = new Cylinder(r,h);
				c.display();
			}
			break;
			case 4 : 
			{
				System.out.print("\n\nEnter length : ");
				float l = sc.nextFloat();
				System.out.print("\nEnter width : ");
				float w = sc.nextFloat();
				System.out.print("\nEnter height : ");
				float h = sc.nextFloat();
				Box b = new Box(l,w,h);
				b.display();
				
			}
			break;
			case 5 : System.exit(0);
			default : System.out.println("Invalid Input");
			break;
		}
	}
	}
}