

class Student{
    int rollno;
    float percentage;
    static int cnt  = 0;

    String name;
    Student(){
        this.rollno = 0;
        this.percentage = 0f;
        this.name = "NULL";
        counter();

    }
    Student(int r,float p,String n)
    {
        this.rollno = r;
        this.percentage = p;
        this.name = n;
        counter();
    }
    void counter()
    {

        cnt++;
        System.out.println("Object "+cnt+" is created");
    }

    void display(){
        System.out.println("Name : " + this.name);
        System.out.println("Percentage : " + this.percentage);
    }

}
public class ass2_setA_que4 {
    public static void main(String[] args) {
        /*
        Define a Student class(rollno, name,percentage) . Ddefine a defualt and parameterized constructor.
        Keep a count of objects created. Created. Create objects using parameterized constructor and siapley the object count
        after each object is created.(Use static member and method. Also display the contents of each oject;

         */
        Student sc = new Student(1,89,"Om Shahane");
        sc.display();
        Student sc2 = new Student(2,70,"Tom Koi");

        sc2.display();

    }
}
