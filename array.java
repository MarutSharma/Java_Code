import java.util.*;
class array
{
    public static void main(String [] args )
    {
        Scanner ob = new Scanner(System.in);
        int n;
        int []array = new int[9];
        System.out.println("Enter Number In Array");
        try
        {
        for(int i = 0;i<10;i++)
        {
            array[i]=ob.nextInt();
        }
        System.out.println("Array Element are");
        for(int i=0;i<10;i++)
        {
            System.out.println(array[i]);
        }
        }
        catch(Exception a)
        {
            
        }
        finally
        {
            System.out.println("IndexOutOfBoundException Occur");
        }
    }
}