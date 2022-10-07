import java.io.*;
import java.util.Scanner;
public class areaFunctionOverload {
    public static final float pie = 3.14f;
    static void area(float rad)
    {
        System.out.println(rad*rad*pie);
    }
    static void area(int sq)
    {
        System.out.println(sq*sq);
    }
    static void area(int l,int b)
    {
        System.out.println(l*b);
    }
    static void area(int b,int h,float f )
    {
        System.out.println(b*h*f);
    }
    
    public static void main(String[] args) {
        int sq,l,b,h;
        float r;
        Scanner sc = new Scanner(System.in);
        System.out.println("Area of Circle");
         r = sc.nextFloat();
        area(r);
        System.out.println("Area of Square");
         sq = sc.nextInt();
        area(sq);
        System.out.println("Area of Rectangle");
        l = sc.nextInt();
        b = sc.nextInt();
        area(l,b);
        System.out.println("Area of Triangle");
        b = sc.nextInt();
        h = sc.nextInt();
        area(b,h,0.5f);
      
    }
    
}
