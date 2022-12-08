import java.util.*;
class array2
{
    public static void main(String [] args )
    {
        Scanner ob = new Scanner(System.in);
        int array[] = new int[11];
        System.out.println("Enter 10 Number In Array");
        for(int i=1;i<=10;i++)
        {
            array[i]=ob.nextInt();
        }
        System.out.println("Reverse Order Of Numbers ");
        for(int i =10;i>0;i--)
        {
            System.out.println(array[i]);
        }
    }
}