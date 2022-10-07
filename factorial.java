import java.io.*;
import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        int i;
        int fact = 1;
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number you want factorial of: ");
        n = sc.nextInt();
        for(i = 1;i<=n;i++)
        {
            fact = fact*i;
        }
        System.out.println("The factorial of number is : "+fact);
    }
}
