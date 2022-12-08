import java.util.*;
class testing 
{
    public static void main(String [] args )
    {
        Scanner ob = new Scanner (System.in);
        int n,i;
        n = ob.nextInt();
        for (i=1;i<n;i++)
        {
            if (n%i==0)
            System.out.println(i);
            else
            System.out.println("Fuck Off !");
        }
    }
}