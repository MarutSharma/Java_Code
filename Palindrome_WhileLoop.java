import java.util.*;
class Palindrome_WhileLoop
{
    public static void main(String [] args)
    {
        Scanner ob = new Scanner (System.in);
        int i,n,d,sum=0,m;
        System.out.println("Enter Your Number ");
        n = ob.nextInt();
        m=n;
        while(n>0)
        {
            d = n%10;
            sum  = sum*10+d;
            n=n/10;
        }
         if (m==sum)
        System.out.println("Palindrome Number ");
        else
        System.out.println("Not A Palindrome Number ");
    }
}