import java.util.*;
class Even_OddWhileLoop
{
    public static void main(String [] args)
    {
        Scanner ob = new Scanner (System.in);
        int i=1,n,sum=0,sum1=0;
        System.out.println("Enter A Number");
        n = ob.nextInt();
        while (i<=n)
        {
            if(i%2==0)
            sum = sum+i;
            else 
            sum1=sum1+i;
            i++;
        }
        System.out.println("The Sum Of Odd Number = "+sum1);
        System.out.println("The Sum Of Even Number = "+sum);
    }
}