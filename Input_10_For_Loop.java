import java.util.Scanner;
class Input_10_For_Loop
{
    public static void main(String [] args )
    {
        Scanner ob = new Scanner (System.in);
        int n,a,sum=0;
        for (a=1;a<=10;a++)
        {
            System.out.println("Enter "+a+ "\t Number ");
            n = ob.nextInt();
            sum = sum + n ;
        }
        System.out.println("The Sum = "+sum);
    }
}