import java.util.*;
class array5
{
    public static void main(String [] args )
    {
        Scanner ob = new Scanner(System.in);
        int sum=0,avg=0,sum1=0,avg2=0;
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
                avg = sum/10;
                
            }
            else
            {
                sum1 = sum1+array[i];
                avg2 = sum1/10;
                
            }
        }
        System.out.println("Average of Even Number =  "+avg);
        System.out.println("Average of Odd  Number =  "+avg2);
    }
}