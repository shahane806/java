package Assignment1;
import java.util.Date;
import java.text.SimpleDateFormat;
public class ass1_setB_que1 {
    public static void main(String[] args) {
        /*
        Write a java program to display the system date and time in various formats shown below
        Current date is : 31/07/2015
        Current date is : 07-31-2015
        Current date is : Friday July 31 2015
        Current date and time is : Fri July 31 16:25:56 IST 2015
        Current date and time is :31/07/15 16:25:56 PM +0530
        Current time is : 16:25:56
        Current week of year is :31
        Current week of month : 5
        Current day of year : 212
        Note : Use java.util.Date and java.text.SimpleDateFormat class
         */
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String st =  sdf.format(date);
        System.out.println("Current date is : "+st);
        SimpleDateFormat sdf2 = new SimpleDateFormat("MM-dd-yyyy");
        st = sdf2.format(date);
        System.out.println("Current date is : "+st);
        SimpleDateFormat sdf3 = new SimpleDateFormat("EEEE MMMM dd yyyy");
        System.out.println("Current date is : "+sdf3.format(date));
        SimpleDateFormat sdf4 = new SimpleDateFormat("EE MMMM dd hh:mm:ss z yyyy");
        System.out.println("Current date and time is : "+sdf4.format(date));
        SimpleDateFormat sdf5 = new SimpleDateFormat("dd/mm/yyyy hh:mm:ss a Z");
        System.out.println("Current date and time is : "+  sdf5.format(date));
        SimpleDateFormat sdf6 = new SimpleDateFormat("hh:mm:ss");
        System.out.println("Current time is : "+sdf6.format(date));
        SimpleDateFormat sdf7 = new SimpleDateFormat("w");
        System.out.println("Current week of year : "+sdf7.format(date));
        SimpleDateFormat sdf8 = new SimpleDateFormat("F");
        System.out.println("Current week of month : "+sdf8.format(date));
        SimpleDateFormat sdf9 = new SimpleDateFormat("D");
        System.out.println("Current day of year : "+sdf9.format(date));

    }
}
