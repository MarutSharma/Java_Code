

import java.util.*;
class array_fire
{
    public static void main(String [] args )
    {
        Scanner ob = new Scanner(System.in);
        int a[] = new int[5];
        int b[] = new int[5];
        int c[] = new int[5];
        int z=0;
        System.out.print("Enter Array A ");
        for(int i=0;i<5;i++)
        {
            a[i]=ob.nextInt();
        }
        System.out.print("Enter Array B ");
        for(int j =0;j<5;j++)
        {
            b[j]=ob.nextInt();
        }
        for(int i =0;i<5;i++)
        {
            for(int j=0;j<5;j++)
            {
                for( z =0;z<5;z++)
                {
                    c[z]=a[i]+b[j];
                    
                }
            }
            System.out.println("Sum Of A And B = "+c[z]);
        }
       
    }
}