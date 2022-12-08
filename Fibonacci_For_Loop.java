import java.util.*;
class Fibonacci_For_Loop
{
    public static void main (String [] args )
    {
        Scanner ob = new Scanner (System.in);
        int n ,i,m,sum=0,sum1=1,sum2 ;
        System.out.println("Enter Number ");
        n = ob.nextInt();
        for (i=0;i<=n;i++)
        {
            sum2 = sum+sum1;
            System.out.println(sum);
            sum = sum1;
            sum1 = sum2;
        }
    }
}