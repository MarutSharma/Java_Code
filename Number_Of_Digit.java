import java.util.*;
class Number_Of_Digit
{
    public static void main(String [] args)
    {
        Scanner ob = new Scanner (System.in);
        int n,d,sum = 0,m=0;
        System.out.println("Enter Number ");
        n = ob.nextInt();
        for (int i =0;n!=0;i++)
        {
             d = n%10;
             sum = sum *10+d;
             n = n/10;
             m++;
        }
        System.out.println("Length of The Number Entered = "+m);
    }
}