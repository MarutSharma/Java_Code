import java.util.Scanner;
class Sal
{
    public static void main(String[] args)
    {
        Scanner off = new Scanner(System.in);
        double sal,gross,net,pf,da,hra;
        char name;
        System.out.println("Enter Your Name ");
        name = off.next().charAt(0);
        System.out.println("Enter Your Basic Salary ");
        sal = off.nextDouble();
        da = 20/100.0*sal;
        hra = 12.6/100.0*sal;
        pf = 10/100.0*sal;
        gross = sal+da+hra;
        net = gross - pf;
        System.out.println("Gross Salary ="+gross);
        System.out.println("Net Salary ="+net);        
    }
}