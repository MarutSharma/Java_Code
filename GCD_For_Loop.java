import java.util.*;
class GCD_For_Loop
{
    public static void main(String [] args )
    {
        Scanner ob = new Scanner (System.in);
        int a,b,t,gcd;
        System.out.println("Enter Number ");
        a = ob.nextInt();
        System.out.println("Enter Number ");
        b = ob.nextInt();
        for (int i=0;i<=b;i++)
        {
            t = b;
            b = a%b;
            a=t;
        }
        gcd =a;
        System.out.println("G.C.D Is "+gcd);
    }
}