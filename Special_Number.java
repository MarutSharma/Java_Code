import java.util.*;
class Special_Number 
{
    public static void main(String [] args )
    {
        Scanner ob = new Scanner(System.in);
        int n,d,sum =0,m,sum2=0;
        System.out.println("Enter Number ");
        n = ob.nextInt();
        m=n;
        for(int i =0;n!=0;i++)
        {
            int sum1=1;
            d =n%10;
            sum = sum*10+d;
            n = n/10;
            for(int j=1;j<=d;j++)
            {
                sum1 = sum1*j;
            }
            sum2 = sum2+sum1;
        }
        if(m==sum2)
        System.out.println("Special Number ");
        else 
        System.out.println("Chutiya Number ");
    }
}
