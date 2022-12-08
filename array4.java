import java.util.*;
class array4
{
    public static void main(String [] args )
    {
        Scanner ob = new Scanner(System.in);
        int array[] = new int[10];
        System.out.println("Enter Number In Array");
        for(int i=0;i<10;i++)
        {
            array[i]=ob.nextInt();
        }
        for(int i =0;i<10;i++)
        {
            if(array[i]>0)
            System.out.println("Positive Number  "+array[i]);
            else
            System.out.println("Negative Number "+array[i]);
        }
    }
}