import java.util.*;
class Perfect_For_Loop
{
    public static void main (String [] args )
    {
        Scanner ob = new Scanner (System.in);
        int n ,i,m,sum=0 ;
        System.out.println("Enter Number ");
        n = ob.nextInt();
        m=n;
        for (i=1;i<n;i++)
        {
            if (n%i==0)
            sum = sum +i;
        }
        if (sum==n)
        System.out.println(n+"  Perfect Number ");
        else
        System.out.println(n+" Not Perfect Number ");
    }
}