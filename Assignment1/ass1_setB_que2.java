package Assignment1;

import java.util.Scanner;

class MyNumber{
    private int num;
    MyNumber(){
        this.num = 0;
    }
    MyNumber(int n)
    {
        this.num = n;
    }
    public void isNegative()
    {
        if (this.num < 0) {

            System.out.println("Number is Negative");
        }
    }
    public void isPositive()
    {
        if(this.num>0){
            System.out.println("Number is Positive");
        }
    }
    public void isZero()
    {
        if (this.num == 0) {
            System.out.println("Number is zero");
        }
    }
    public void isOdd()
    {
        if (this.num % 2 == 1) {
            System.out.println("Number is Odd");
        }
       else if(this.num < 0) {
            if ( -this.num % 2 == 1) {
                System.out.println("Number is Odd");
            }
        }
    }
    public void isEven()
    {
        if (this.num % 2 == 0) {
            System.out.println("Number is Even");
        }
        else if(this.num < 0) {
            if ( -this.num % 2 == 0) {
                System.out.println("Number is Even");
            }
        }
    }
}
public class ass1_setB_que2 {
    public static void main(String[] args) {
        /*
        Define a class MyNumber having one private int data member. Write a default constructor to initialize it to 0 and
        another constructor to initialize it to a value(Use this). Write methods
        isNegative,
        isPositive,
        isZero,
        isOdd,
        isEven.
        Create an object in main. Use command line arguments to pass a value to the object
        (Hint : convert string argument to integer) and perform the above tests.
        Provide javadoc comments for all constructors and methods and generate the html help file.

         */
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        n = sc.nextInt();
        MyNumber  n1 = new MyNumber(n);
        n1.isNegative();
        n1.isOdd();
        if (n != 0) {
            n1.isEven();
        }

        n1.isZero();
        n1.isPositive();
    }
}
