import java.io.*;
import java.util.Scanner;

public class recursiveTable {
    public static void multiTable(int n,int i)
    {
       
        if(i<=10)
           { System.out.println(n* i);
        
                multiTable(n, ++i);
           }
    }
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        n = sc.nextInt();
        multiTable(n, 1);
        
    }
}
