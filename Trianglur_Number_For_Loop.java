import java.util.*;
class Trianglur_Number_For_Loop
{
    public static void main(String [] args )
    {
        Scanner ob = new Scanner (System.in);
        int p =0;
        boolean flag = false ;
        System.out.println("Enter Number ");
        int n= ob.nextInt();
        for (int i =1 ; i<= n; i++)
        {
            p = p+i ;
            if (p == n)
            flag = true;
        }
        if (flag==true)
        System.out.println("Triangular Number ");
        else 
        System.out.println("Not Triangular Number ");
    }
}