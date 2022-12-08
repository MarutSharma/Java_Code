import java.util.*;
class Check_Pronic_Number 
{
    public static void main (String [] args )
    {
        Scanner ob = new Scanner (System.in);
        boolean flag = false ;
        System.out.println("Enter Number - ");
        int n = ob.nextInt();
        for (int i =1;i<=n;i++)
        {
        if (i*(i+1) == n)
        flag = true ;
        }
        if (flag == true )
        System.out.println("Pronic Number ");
        else
        System.out.println("Not Pronic Number ");
    }
}