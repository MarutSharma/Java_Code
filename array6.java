import java.util.*;
class array6
{
    public static void main(String [] args )
    {
        Scanner ob = new Scanner(System.in);
        int sum=0,sum1=0;
        int array[] = new int[10];
        System.out.println("Enter Number In Array");
        for(int i=0;i<10;i++)
        {
            array[i]=ob.nextInt();
        }
        for(int i =0;i<10;i++)
        {
            if(array[i]%2==0)
            {
                sum = sum+array[i];
            }
            else
            {
                sum1 = sum1+array[i];
            }
        }
        System.out.println("Sum of Even Number =  "+sum);
        System.out.println("Sum of Odd  Number =  "+sum1);
    }
}