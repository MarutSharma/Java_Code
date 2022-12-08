import java.util.*;
class Table_For
{
    public static void main (String [] args )
    {
        Scanner ob = new Scanner (System.in);
        int n,i,sum;
        System.out.println("Enter Your Number ");
        n =ob.nextInt();
        for (i=1;i<=10;i++)
        {
            System.out.printf("%d * %d = %d \n",n,i,n*i);
        }
        
    }
}