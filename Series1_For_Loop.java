import java.util.*;
class Series1_For_Loop
{
    public static void main (String [] args )
    {
        Scanner ob = new Scanner (System.in);
        int i,n ;
        double sum =0;
        System.out.println("Enter Your Value");
        n = ob.nextInt();
        for (i=1;i<=n;i++)
        {
             sum  = sum+(Math.pow(i,2));
             System.out.println(sum);
            
        }
        
    }
}