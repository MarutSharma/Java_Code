import java.util.*;
class Return_OddEven_Program
{
    boolean Oddeven(int num)
    {
        if (num%2==0)
        return true;
        else
        return false ;
    }
    public static void main(String [] args )
    {
        Scanner ob = new Scanner (System.in);
        Return_OddEven_Program obj = new Return_OddEven_Program();
        int n; 
        System.out.println("Enter Number ");
        n = ob.nextInt();
        boolean z = obj.Oddeven(n);
        if ( z == true )
        System.out.println("Even Number ");
        else 
        System.out.println("Odd Number ");
    }
}