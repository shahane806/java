
import java.io.*;
import java.util.Scanner;
class Person{
    private int pid;
    private String pname;
    private int age;
    private char gender;
    Person(){
        this.pid = 0;
        this.pname = "null";
        this.gender = 'N';
    }

    Person(int pid, String name, char gender) {
        this.pid = pid;
        this.pname = name;
        this.gender = gender;
    }
 
    public void display(){
        System.out.println("Id : "+this.pid+"  "+"Name : "+this.pname+"  "+"Gender : "+this.gender);
    }

}
public class ass2_setA_que6 {
    public static void main(String[] args) {
        /*
        Define a class person(pid,pname,age,gender)
        Define the default and parameterized constructor.
        Overload the constructor.
        Accept the 5 person details and display it(using this keyword)
         */
        Person p = new Person(1,"Om Shahane",'M');
        Person p2 = new Person(2, "Pratik Puri", 'M');
        Person p3 = new Person(3, "Ankita Mane", 'F');
        Person p4 = new Person(4, "MJ", 'F');
        Person p5 = new Person(5, "SK", 'M');
        p.display();
        p2.display();
        p3.display();
        p4.display();
        p5.display();

    }
}
