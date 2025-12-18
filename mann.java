import java.util.Scanner;
public class IncomeTax
{
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.println("enter your income:");
        double income = input.nextDouble();
        double tax = 0;
        if(income <= 500000)
        {
            tax=0;
            System.out.println("no tax");
        }
        else if(income <= 1000000)
        {
            tax=income*0.20;
            System.out.println("20% tax applied");
        }
        else
        {
            tax=income*0.30;
            System.out.println("30% tax applied");
        }
        System.out.println("Income tax= " +tax);
    }

}
