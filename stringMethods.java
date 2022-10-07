import java.io.*;
import java.util.Scanner;
public class stringMethods {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.println("String Methods in Java");
        // String string;
        // string = sc.next();
        // System.out.println("By using next() method");
        // System.out.println(string);
        // string = sc.nextLine();
        // System.out.println("By using nextLine() method");
        // System.out.println(string);


        String st;
        st =  sc.nextLine();
        // System.out.println(st.length());
        // System.out.println("charAt() method returns char at specific position return int : "+st.charAt(5));
        // System.out.println("codePointAt() method returns Unicode of first char of string return int : "+st.codePointAt(0));
        // System.out.println("charAt() method returns char at specific position return int : "+st.charAt(4));
        // System.out.println("codePointBefore() method returns Unicode before the specific index return int : "+st.codePointBefore(5));
        // System.out.println("codePointCount() method returns total count of Unicode present in string return int : "+st.codePointCount(0, st.length()));
        // System.out.println("toLowerCase() method return string in lower case : "+st.toLowerCase());
        // System.out.println("toUpperCase() method return string in Upper case : "+st.toUpperCase());
        // System.out.println("trim() method trim spaces from starting and ending of string : "+ st.trim());
        // System.out.println("replace() method replace old char to new char : "+st.replace("H","t"));
        // System.out.println(" replaceAll() replaces all the occarance by replacement : "+st.replaceAll("hel","ten"));
        // System.out.println("hashCode() return hash string of given string : "+st.hashCode());
    



        // System.out.println("endsWith() method check the given string endswith suffix of not it return boolean value True or False : "+st.endsWith("s"));
        // System.out.println("startsWith() method check the given string startsWith suffix of not it return boolean value True or False : "+st.startsWith("s"));
        String s = sc.nextLine();


        //compare strings

        // System.out.println("equals() method compare two strings : "+st.equals(s));
        // System.out.println("equalsIgnoreCase() method compare two strings by ignore case : "+st.equalsIgnoreCase(s));
    }
}
