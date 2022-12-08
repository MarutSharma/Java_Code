import java.util.*;
class Greatest_Number_Program
{
    public static void main(String [] args )
    {
        Scanner ob = new Scanner(System.in);
        int large =0 ;
        for ( int i = 1;i<=10;i++)
        {
            System.out.println("Enter " +i+  " Number ");
            int n = ob.nextInt();
            if (n>1)
            {
                large = n;
            }
        }
        System.out.println("Greatest Number "+large);
    }
}