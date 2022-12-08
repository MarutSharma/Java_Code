import java.util.*;
class array_Searching
{
    public static void main(String [] args )
    {
        Scanner ob = new Scanner(System.in);
        int sum=0,sum1=0,n;
        boolean flag = false ;
        int array[] = new int[10];
        
        System.out.println("Enter Number In Array");
        for(int i=0;i<10;i++)
        {
            array[i]=ob.nextInt();
        }
        System.out.println("Enter Searching Number ");
        n = ob.nextInt();
        for(int i =0;i<10;i++)
        {
            if(n==array[i])
            {
                flag = true;
            }
        }
        if(flag==true)
        System.out.println("Number Founded ");
        else
        System.out.println("Number Not Founded ");
    }
}