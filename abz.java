import java.util.*;
class abz
{
    int a,b,c,r;
    Scanner ob = new Scanner (System.in);
    abz()
    {
        a=b=c=0;
    }
    void input()
    {
        System.out.println("Enter Three Side Of Triangle ");
        a = ob.nextInt();
        b = ob.nextInt();
        c = ob.nextInt();
    }
    int  check() 
    {  
    if (a+b>c && b+c>a && c+a>b)
    { 
        return 1;
    }
    return 0;
    }
    void area()
    {
        int area1,res,s;
        res = check(); 
        if (res==1)
        {
            s = a+b+c/2;
            double h = Math.sqrt(s*(s-a)*(s-b)*(s-c));
            System.out.println("Triangle Formed And Area Of Triangle = "+h);
        }
        else
        {
            System.out.println("Trianle Not Formed ");
        }
    }
    public static void main(String [] args )
    {
        abz obj = new abz();
        obj.input();
        obj.area();
    }
}