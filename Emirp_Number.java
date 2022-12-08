import java.util.*;
class Emirp_Number
{
    public static void main(String [] args )
    {
        Scanner ob = new Scanner(System.in);
        int n,i,z,d,sum=0,x=0,l=0;
        boolean flag = false;
        boolean lag = false;
        System.out.println("Enter Number To Check Emirp Number Or Not");
        n = ob.nextInt();
        z=n;
        for (i=0;n!=0;i++)
        {
            d = n%10;
            sum = sum*10+d;
            n =n/10;
        }
        for (int k=2;k<=z/2;k++)
        {
            if(z%k==0)
            flag = true;
            break;
        }
        for (int o=2;o<=sum/2;o++)
        {
            if(sum%o==0)
            lag = true;
            break;
        }
        if (!flag && !lag)
        System.out.println("Emirp Number ");
        else 
        System.out.println("Not A Emirp Number ");
    }
}