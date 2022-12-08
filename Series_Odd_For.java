import java.util.Scanner;
class Series_Odd_For
{
    public static void main(String [] args )
    {
        Scanner ob = new Scanner (System.in);
        int n,i;
        //System.out.println("Enter Your Value ");
        //n = ob.nextInt();
        for (i=0;i<=200;i++)
        {
            if (i%2!=0)
            System.out.println(i);
        }
    }
}