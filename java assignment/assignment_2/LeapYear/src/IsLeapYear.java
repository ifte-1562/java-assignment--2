import java.util.*;

public class IsLeapYear {
    public static void main(String[] args) {
        double year;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a year:");
        year=in.nextDouble();
        LeapYear lp=new LeapYear(year);
        if(lp.getYear())
        System.out.printf("%.0f is leap year",year);
        else
        System.out.printf("%.0f is not leap year",year);
    }
}
