package Assignment1;
import java.io.*;

class MyClass{
int id;
MyClass(){
    this.id = 0;
    System.out.println(this.id);
}
}
public class ass1_setA_que2 {
    public static void main(String[] args) {
        /*
        Compile sample program 2. type the following command and view the bytecodes javap -c MyClass

         */
        System.out.println("Hello");
       new MyClass();
    }
}
