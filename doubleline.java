import java.io.*;
import java.util.Scanner;
public class doubleline{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String str= sc.nextLine();
        boolean b  = str.contains(" ");
        System.out.println(b);
    }
}