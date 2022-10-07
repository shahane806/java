import java.io.*;
import java.util.Scanner;
public class fibonacheSeries {
    public static void main(String[] args)
    {
        int f = 0,s = 1,i,n;
        int t;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        System.out.print(f);
        System.out.print(" "+s);
        for(i = 1;i<=n-2;i++)
        {
            t = f+s;
            f =s ;
            s = t;
            System.out.print(" "+t);

        }
    }
}
