import java.io.*;
import java.util.Scanner;
public class recursivefibo {
  static void recurFib(int n,int a,int b)
  {
    int c = a+b;
    a = b;
    b = c;
    System.out.print(c+" ");
    if(n>0)
    {

        recurFib(--n, a, b);
    }
  }
  public static void main(String[] args) {
    int a = 0, b = 1, n;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter number");
    n = sc.nextInt();
    System.out.print(a+" "+b+" ");
    recurFib(n-3,a,b);
  }
}
