import java.util.*;
class Neon_Function_Program
{
    void Neon(int num)
    {
        int d, sum=0,m;
        m= num;
        while (num!=0)
        {
            d = num%10;
            sum = sum +d;
            num = num/10;
        }
        if (m==sum)
        System.out.println("Neon Number ");
        else 
        System.out.println("Not A Neon Number ");
    }
    public static void main(String [] args )
    {
        Scanner ob = new Scanner (System.in);
        Neon_Function_Program obj = new Neon_Function_Program();
        int n;
        System.out.println("Enter Number ");
        n = ob.nextInt();
        obj.Neon(n);
    }
}