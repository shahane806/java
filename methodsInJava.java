import java.io.*;
import java.util.Scanner;
public class methodsInJava {
    public static void swap(int []a,int []b)
    {
        int temp;
        temp = a[0];
        a[0] = b[0];
        b[0] = temp;
    }
    public static void swap2(int a,int b)
    {
        int temp;
        temp = a;
        a = b;
        b = temp;
        System.out.println(a+" "+b);
    }
 public static void main(String[] args) {
    // int []a = new int[1];
    // int []b = new int[1];
     Scanner sc = new Scanner(System.in);
    // a[0] = sc.nextInt();
    // b[0] = sc.nextInt();
    // swap(a,b);
    // System.out.println(a[0]);
    // System.out.println(b[0]);

    int a,b;
    a = sc.nextInt();
    b = sc.nextInt();
    swap2(a,b);


 }   
}
