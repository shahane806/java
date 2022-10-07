import java.io.*;
import java.util.Scanner;
public class Areas {
 public static void main(String[] args) {
    int radi;
    int len,bre;
    Scanner sc = new Scanner(System.in);
    System.out.println("Area of Circle");
    System.out.println("Enter Radius");
    radi = sc.nextInt();
    System.out.println("The area of circle is : "+(3.14f*radi*radi));
    System.out.println("Area of Rectangle");
    System.out.println("Enter length and Breadth");
    len= sc.nextInt();
    bre = sc.nextInt();
    System.out.println("The area of Rectangle is : "+(len*bre));
    
    System.out.println("Area of Square");
    System.out.println("Enter side");
    len= sc.nextInt();
   
    System.out.println("The area of Square is : "+(len*len));

 }   
}
