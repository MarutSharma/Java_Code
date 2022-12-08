import java.util.*;
class Power_For_Loop
{
    public static void main(String [] args)
    {
        Scanner ob = new Scanner (System.in);
        int sum = 1,n,i,m;
        System.out.println("Enter First Number ");
        n = ob.nextInt();
        System.out.println("Enter Second Number ");
        m = ob.nextInt();
        for (i=1;i<=m;i++)
        {
            sum = sum*n;
        }
        System.out.println("The Power =  "+sum);
    }
}