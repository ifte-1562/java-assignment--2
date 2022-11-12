import java.util.*;
public class DecimalTORoman {
    public static void main(String[] args) throws InterruptedException {
        String XX;
        for(int i=0;i<100;i++) {
            System.out.println("Enter a decimal number =");
            Scanner in = new Scanner(System.in);
            double num;
            num = in.nextDouble();
            Convert dr = new Convert(num);
            System.out.println("The equivalent Roman number =");
            System.out.println(dr.getSt());
           //XX = in.next();
           /// System.out.printf("\u000C");
          //  Thread.sleep(3000);

        }

    }
}
