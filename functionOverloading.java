import java.io.*;
import java.util.Scanner;
public class functionOverloading {
   static int sum(int a,int b)
   {
    return a+b;
   }
   static int sum(int a,int b,int c)
   {
    return a+b+c;
   }
   static int sum(int a,int b,int c,int d)
   {
    return a+b+c+d;
   }
   public static void main(String[] args) {
    int c;
    int a,b,e,f;
    Scanner sc = new Scanner(System.in);                  
    a = sc.nextInt();
    b = sc.nextInt();
    e = sc.nextInt();
    f = sc.nextInt();
    System.out.println();
    System.out.println();
    c = sum(a,b);
    System.out.println(c);
    c = sum(a,b,e);
    System.out.println(c);
    c = sum(a,b,e,f);
    System.out.println(c);
   }
    
}
