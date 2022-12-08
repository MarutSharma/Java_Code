import java.util.*;
class Employee
{
    String name;
    double hra,da,pf,tot,netsal,z,basic;
    Scanner ob = new Scanner(System.in);
    Employee()
    {
        basic=0;
        hra=da=pf=tot=netsal=0;
    }
    void input()
    {
        System.out.println("Enter Name ");
        name = ob.nextLine();
        System.out.println("Enter Basic Salary ");
        basic = ob.nextInt();
    }
    double process()
    { 
        da = basic*(45.0/100);
        hra =basic*(15.0/100);
        pf =basic*(8.33/100);
        tot = basic+da+hra;
        netsal = tot-pf;
        return netsal;
    }
    double bonus()
    {
        double b,x;
        x = process();
        if (netsal>20000)
        {
            b = netsal*(5.0/100);
            z = b+netsal;
            return z;   
        }
        else
        {
        return x;
        }  
    }
    void display()
    {
        double res2 = bonus();
        System.out.println("Name  - "+name+ "\tNet Salary - "+res2);
    }
    public static void main(String [] args )
    {
        Employee obz = new Employee();
        obz.input();
        obz.display();
    }
}