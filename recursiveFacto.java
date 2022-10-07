import java.io.*;
 import java.util.Scanner;
public class recursiveFacto {
    static int facto(int n)
    {
        if(n > 0)
        {
            return n * facto(n-1);
        }
        else 
        {
            return 1;
        }
    }
     public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
         n = sc.nextInt();
        int c = facto(n);
        System.out.println(c);
     }
}
