import java.util.Scanner;
class Sum_For_Loop
{
    public static void main(String [] args )
    {
        Scanner ob = new Scanner (System.in);
        int a,n,sum=0 ;
        System.out.println("Enter Number ");
        n = ob.nextInt();
        for (a=1; a<=n;a++)
        {
            sum  = sum + a;
        }
        System.out.println("The Sum Of N Number = "+sum);
    }
}