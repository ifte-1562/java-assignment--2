import java.util.*;
public class TaxsPay {
    public static void main(String[] args) {
        System.out.println("Enter 1 if you married or 0:");
        Scanner input =new Scanner(System.in);
        int ss=input.nextInt();
        System.out.println("Enter your monthly income:");
        double tax=0;
        if(ss==1)
        {
            double income = input.nextDouble();
           if(income<=16000)
           {
               tax=income*10/100;
           }
           else if(income>16000)
           {
               tax=16000*10/100;
               if(income<=64000)
               {
                   tax=tax+(income-16000)*15/100;
               }
              else if(income>64000)
               {
                   tax=tax+(64000-16000)*15/100+(income-64000)*25/100;


               }



           }

        }
        else
        {
            double income = input.nextDouble();
            if(income<=8000)
            {
                tax=income*10/100;
            }
            else if(income>8000)
            {
                tax=8000*10/100;
                if(income<=32000)
                {
                    tax=tax+(income-8000)*15/100;
                }
                else if(income>32000)
                {
                    tax=tax+(income-8000)*15/100+(income-32000)*25/100;


                }



            }

        }
        System.out.println(tax);
    }
}
