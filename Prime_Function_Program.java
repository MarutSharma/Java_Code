import java.util.*;
class Prime_Function_Program
{
    boolean prime(int num)
    {
        for (int i=2;i<=num/2;i++)
        {
            if (num%i==0)
            {
                return false ;
            }
        }
        return true ;
    }
    public static void main (String [] args )
    {
        Scanner ob = new Scanner (System.in);
        Prime_Function_Program obj = new Prime_Function_Program();
        int n;
        System.out.println("Enter Number ");
        n = ob.nextInt();
        boolean z = obj.prime(n);
        if (z == true )
        System.out.println("Prime Number ");
        else 
        System.out.println("Not Prime Number ");
    }
}
    
