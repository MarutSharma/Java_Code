import java.util.*;
class array3
{
    public static void main(String [] args )
    {
        Scanner ob = new Scanner(System.in);
        int sum=0;
        int array[] = new int[11];
        System.out.println("Enter 10 Number In Array");
        for(int i=1;i<=10;i++)
        {
            array[i]=ob.nextInt();
        }
        //System.out.println("Reverse Order Of Numbers ");
        for(int i=1;i<=10;i++)
        {
            sum = sum+array[i];
        }
        int avg = sum/10;
        System.out.println("Sum Of The Array ="+sum);
        System.out.println("Average Of The Array ="+avg);
    }
}