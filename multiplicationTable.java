import java.io.*;
import java.util.Scanner;
public class multiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter number you want multiplication table of : ");
        n = sc.nextInt();
        for(int i = 1;i<=10;i++)
        {
            System.out.printf("%d X %d = %d\n",n,i,n*i);
        }
    }
}
