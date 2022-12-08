import java.util.Scanner;
class Odd_Even_Sum_For_Loop
{
    public static void main(String [] args )
    {
        Scanner ob = new Scanner (System.in);
        int a,n,sum=0,sum1 =0  ;
        System.out.println("Enter Number ");
        n = ob.nextInt();
        for (a=1; a<=n;a++)
        {
            if (a%2==0)
            sum = sum+a;
            if (a%2!=0)
            sum1 = sum1 + a;
        }
        System.out.println("The Sum Of Even Number = "+sum);
        System.out.println("The Sum Of Odd Number = "+sum1);
    }
}