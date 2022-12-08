import java.util.Scanner;
class Factor_For_Loop
{
    public static void main (String [] args )
    {
        Scanner on =  new Scanner (System.in);
        int n,i;
        System.out.println("Enter Your Number ");
        n = on.nextInt();
        for (i=1;i<=n;i++)
        {
            if (n%i==0)
            System.out.println("The Factor = "+i);
        }
    }
}