/*Find the total number of digits 
 Product of all the even digits 
 Difference between largest and smallest digit 
 Average of all the odd digits*/ 


import java.util.Scanner;
class Pro_Class
{
    public static void main (String [] args )
{
    Scanner ob = new Scanner (System.in);
    int n,i=0,sum=0,d=0,p=1,oc=0,l=0,s=9;
    System.out.println("Enter Your Values ");
    n = ob.nextInt();
    while (n>0)
    {
        d=n%10;
        if (d%2==0){
            p=p*d;
        }
        else {
            sum = sum+d;
            oc++;
        }
        if (l<d)
        {
            l = d; 
        }
        if (s>d){
            s = d ;
        }
        
        i++;
        n = n/10;
    }
    System.out.println("The Product Of Even Digit "+p);
    System.out.println("The Total Digit = "+i);
    System.out.println("Difference B/T Largest And Smallest "+(l-s));
    System.out.println("The Average Of Odd Digit "+(sum/oc));
}
}