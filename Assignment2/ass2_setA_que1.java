
class maxMin{
    private int n1,n2,n3;
    maxMin(){
        this.n1 = 0;
        this.n2 = 0;
        this.n3 = 0;

    }
    maxMin(int num1,int num2, int num3) {
        this.n1 = num1;
        this.n2 = num2;
        this.n3 = num3;
        if (this.n1 > this.n2 && this.n1 > this.n3) {
            System.out.println(this.n1 + " is Maximum");
        }
        else if (this.n2 > this.n1 && this.n2 > this.n3) {
            System.out.println(this.n2 + " is Maximum");
        }
        else if (this.n3 > this.n2 && this.n3 > this.n1) {
            System.out.println(this.n3 + " is Maximum");
        }
        if (this.n1 < this.n2 && this.n1 < this.n3) {
            System.out.println(this.n1 + " is Minimum");
        }
        else if (this.n2 < this.n1 && this.n2 < this.n3) {
            System.out.println(this.n2 + " is Minimum");
        }
        else if (this.n3 < this.n2 && this.n3 < this.n1) {
            System.out.println(this.n3 + " is Minimum");
        }

    }

}
public class ass2_setA_que1{
    public static void main(String[] args) {
        /*
        Write a java program which accepts 3 int values and prints the maximum and minimum.

         */
        new maxMin(4,3);
        new maxMin(6,1,8);

    }
}
