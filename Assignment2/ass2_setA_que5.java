
import java.util.Scanner;
public class ass2_setA_que5 {
    public static void main(String[] args) {
        /*
        Write a java program which accepts a string and a characters to be search from the user the program
        should display the totalno of character in string;
         */

        String n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        n = sc.nextLine();
        System.out.println("Enter char to match");
        char c = sc.next().charAt(0);
        System.out.println("Length of String is : "+n.length());
        for (int i = 0; i < n.length(); i++) {
            if (c == n.charAt(i)) {
                System.out.println("Matches at index "+i);
            }
        }
    }
}
