
import java.util.Scanner;

class Employee
{
    private int salary;
    private String name;
    Employee(){
        this.salary = 0;
        this.name = "null";
    }
    Employee(int s,String n){
        this.name = n;
        this.salary = s;
    }						

    public void setName(String n) {
        this.name = n;

    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    public void display(){System.out.println(this.name +" "+this.salary);}

    public void printMaxSal(Employee[] employees) {
        int max = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].salary> max) {
                max = employees[i].salary;
            }


        }
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].salary == max) {
                System.out.println(employees[i].name);
            }
        }
    }
}
public class ass2_setA_que3 {
    public static void main(String[] args) {
        /*
            Write a java program which define class Employee with data member as name and salary program store the
            information of 5 employee and display the name who earn maximum salary(Use array of object)

         */
        Employee em[] = new Employee[5];
        Scanner sc = new Scanner(System.in);
        int s;
        String n,n1;
        System.out.println("Enter employee details");
        for (int i = 0; i < em.length; i++) {
            em[i] = new Employee();
            System.out.print("Enter Salary : ");
            s= sc.nextInt();
            em[i].setSalary(s);
            System.out.print("\n Enter Name : ");
            n1 = sc.next();
            n = sc.nextLine();
            em[i].setName(n1+n);
        }
        for (int i = 0; i < em.length; i++) {
            em[i].display();
        }
        em[0].printMaxSal(em);


    }
}
