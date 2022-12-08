//LIMIT SETTING PROGRAM USING WHILE LOOP *********************** COMPLETED //


import java.util.*;
class Rev_Class 
{
    public static void main(String [] args )
    {
        Scanner ob = new Scanner (System.in);
        int l,n,d,c=0,r=0,z;
        System.out.println("Enter The Limit ");
        l = ob.nextInt();
        System.out.println("Enter Number ");
        n = ob.nextInt();
        d= n;
        while (n!=0)
        {
            n = n/10;
            c++;
        }
        if (c==l)
        {
            while(d!=0)
            {
                z=d%10;
                r = r*10+z;
                d= d/10;
            }
            System.out.println("Reverse Number = "+r);
        }
        else {
            System.out.println("Invalid Number");
        }
        }
       
    }

