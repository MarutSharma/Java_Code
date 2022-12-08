import java.util.*;
class abc 
{
    int p,r,t;
    Scanner ob = new Scanner (System.in);
    abc()
    {
        p=r=t=0;
    }
    void input()
    {
        System.out.println("Enter Principal ");
        p =ob.nextInt();
        System.out.println("Enter Rate Of Intrest ");
        r =ob.nextInt();
        System.out.println("Enter Time (In Years )");
        t =ob.nextInt();
    }
    double intrest()
    {
        double si = p*r*t/100.0;
        return si;
    }
    void display()
    {
        double res = intrest();
        System.out.println("Simple Intrest = "+res);
    }
    public static void main(String [] args )
    {
        abc obj = new abc();
        obj.input();
        obj.display();
    }
}