import java.util.*;
class String_Decimal_Sum_Pro
{
    public static void main(String [] args)
    {
        Scanner ob = new Scanner (System.in);
        double n = 174.567;
        String d ="";
        d = d+n;
        int p = d.indexOf('.');
        int x = Integer.parseInt(d.substring(0,p));
        int y = Integer.parseInt(d.substring(p+1));
        System.out.println("The Number Is "+n);
        System.out.println("Sum of Number = "+(x+y));
        
        
        
        
    }
}