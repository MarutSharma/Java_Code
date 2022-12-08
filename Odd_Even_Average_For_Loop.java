import java.util.Scanner;
class Odd_Even_Average_For_Loop
{
    public static void main(String [] args )
    {
        Scanner ob = new Scanner (System.in);
        int a,n,sum=0,sum1 =0,i=1,q =1,avgodd,avgeven   ;
        System.out.println("Enter Number ");
        n = ob.nextInt();
        for (a=1; a<=n;a++)
        {
            if (a%2==0)
            sum = sum+a;
            i++;
            if (a%2!=0)
            sum1 = sum1 + a;
            q++;
        }
        avgeven = sum/i;
        avgodd = sum1/q;
        System.out.println("The Average Of Even Number = "+avgeven);
        System.out.println("The Average Of Odd Number = "+avgodd);
    }
}