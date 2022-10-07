import java.io.*;
import java.util.Scanner;
public class Marks
{
    public static void main(String[] args)
    {
        int []marks = new int[5];
        try (Scanner sc = new Scanner(System.in)) {
            int sum = 0;
            System.out.println("Enter marks of 5 subjects");
      
            for(int i = 0;i<5;i++)
            {
                marks[i]=sc.nextInt();

            }
            for(int e:marks)
            {
               sum+=e;
            }
            System.out.println("The sum is : "+sum);
        }
    }
}