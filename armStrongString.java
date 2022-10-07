import java.io.*;
import java.util.Scanner;

public class armStrongString {
    public static void main(String[] args)
    {
        //Armstrong String
        String s ;
        Scanner sc = new Scanner(System.in);
        int t = 0;
        int sum = 0;
        s = sc.nextLine();
        for(int i = 0;i<s.length();i++)
        {

            sum += s.codePointAt(i);
        }
        // System.out.println(sum);
        int num,rem;
        num  = sum;
        t = sum;
        int sum2 = 0;
        int i;
       while(num>0)
        {
            rem = num%10;
            sum2 = sum2+(rem*rem*rem);
            num/=10;
        }
        // System.out.println(sum2);
        if(t == sum2)
        {
            System.out.println("String is Armstrong");
        }
        else
        {
            System.out.println("String is not Armstrong");
        }

    }
}
