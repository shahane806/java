
import java.io.*;
import java.util.Scanner;
public class ass2_setA_que2{
    public static void main(String[] args) {
        /*
        Write a java program which accepts an integer array and print the data and sort the data in decending order

         */
            int arr[] = new int [5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Elements");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        for(int i = 0;i<arr.length;i++)
        {
            for (int j = 0; j < arr.length -1-i; j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp;
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for(int e: arr)
        {
            System.out.print(e+" ");
        }
    }
}