import java.util.*;
class SpyNumber_While
{
    public static void main (String [] args)
    {
        Scanner ob = new Scanner (System.in);
        int n,d,v,sum=0,sum1=1,m;
        System.out.println("Enter Your Number ");
        n = ob.nextInt();
        m=n;
        while (n>0)
        {
            d = n%10;
            sum = sum+d;
            sum1 = sum1*d;
            n = n/10;
        }
        if (sum==sum1)
        System.out.println("Spy Number ");
        else 
        System.out.println("Not A Spy Number ");
    }
}