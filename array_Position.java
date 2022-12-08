import java.util.*;
class array_Position
{
    public static void main(String [] args )
    {
        Scanner ob = new Scanner(System.in);
        int sum=0,sum1=0,n;
        int index = -1;
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
                index = i;
                break;
            }
        }
        System.out.println("Position Of The Number - "+index);
    }
}