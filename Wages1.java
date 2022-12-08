import java.util.*;
class Wages1
{
    String name ;
    double basic,hrs , rate , wage,z;
    Scanner ob = new Scanner (System.in);
    Wages1(double basic , double hrs ,double rate)
    {
        this.basic=basic;
        this.hrs=hrs;
        this.rate=rate;
        this.wage=wage;
    }
    double overtime()
    {
         z = hrs*rate;
        return z;
    }
    void display ()
    {
        double x = overtime();
        wage = x+basic;
        System.out.println(wage);
    }
    public static void main(String [] args )
    {
        Wages1 obj = new Wages1(1000,2,12);
        obj.display();
    }
}