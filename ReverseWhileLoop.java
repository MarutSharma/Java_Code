import java.util.*;
class ReverseWhileLoop
{
    public static void main(String [] args )
    {
        Scanner ob = new Scanner (System.in);
        int i=1,n,sum=0,d=0;
        System.out.println("Enter Your Number ");
        n = ob.nextInt();
        while (n>0)
        {
            d=n%10;
            sum = sum*10+d;
            n=n/10;
        }
        System.out.println("The Reverse Order = "+sum);
    }
}