import java.io.*;
import java.util.Scanner;

public class armStrongNumber {
    public static void main(String[] args)
    {
        //Armstrong Number
        int n,rem,sum = 0;
        int temp=0;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        temp = n;
        int i=0;
        while(n>0)
        {
                rem = n%10;
                // System.out.println(rem);
                sum = sum+(rem*rem*rem);
                // System.out.println(sum);
                n/=10;
                i++;
        }
        if(temp == sum)
        {
            System.out.println("Number is Armstrong");
        }
        else
        {
            System.out.println("Number is Not Armstrong Number");
        }

    }
}
