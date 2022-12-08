import java.util.Scanner;
import java.lang.Math;
class Disarium{ 
 
    public static void main(String args[])
        {
           
            Scanner ob = new Scanner (System.in);
            int n,sum=0,d,sum1=0,i=3,m;
            System.out.println("Enter Your Number ");
            n = ob.nextInt();
            m=n;
            while (n>0)
            {
                d = n%10;
                sum1= sum1+(int)Math.pow(d,i);
                i--;
                n=n/10;
            }
            if (m==sum1)
            System.out.println("Disarium Number ");
            else 
            System.out.println("Not A Disarium Number ");
            
            
        }
    }