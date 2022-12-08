import java.util.Scanner;
class Factorial_For_Loop
{
    public static void main(String [] args )
    {
        Scanner ob = new Scanner (System.in);
        int n,i,sum =1;
        System.out.println("Enter Number For Factorial ");
        n = ob.nextInt();
        for (i=1;i<=n;i++)
        {
            sum = sum * i;
        }
        System.out.println("Factorial  = "+sum);
    }
}