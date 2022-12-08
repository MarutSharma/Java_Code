import java.util.*;
class Pro_Level_for_Loop
{
    public static void main(String [] args )
    {
        Scanner ob = new Scanner (System.in);
        int n,i,odd,even,sum=0,sum1 =0,sum2=0,m;
        System.out.println("Enter Number Or Zero To Quit");
        n = ob.nextInt();
       for (i=0;n!= 0; i++)
        {
            if (n<0 && n%2==0)
            {
                sum = sum+n;
            }
            if (n>0 && n%2==0)
            {
                sum1 = sum1+n;
            }
            if (n>0 && n%2!=0)
            {
                sum2= sum2+n;
            }
             n = ob.nextInt();
        }
        System.out.println("Sum Of Negative Even Number = "+sum);
        System.out.println("Sum Of Positive Even Number = "+sum1);
        System.out.println("Sum Of Positive Odd Number = "+sum2);
    }
}