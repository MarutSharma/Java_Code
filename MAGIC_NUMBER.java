import java.util.*;
class MAGIC_NUMBER
{
    public static void main(String [] args )
    {
        Scanner ob  = new Scanner(System.in);
        int n,d,sum=0,v,sum1=0,z;
        System.out.println("Enter A Number To Check Whether It A Magic Number ");
        n = ob.nextInt();
        for(int i=0;n!=0;i++)
        {
            d = n%10;
            sum = sum+d;
            n = n/10;
            
        }
        /*for(int j=0;sum!=0;j++)
        {
            v = sum%10;
            sum1 = sum1+v;
            sum = sum/10;
        }*/
        //if(sum1==1)
        System.out.println("It Is A Magic Number - "+sum);
    }
}