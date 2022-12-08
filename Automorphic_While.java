import java.util.*;
class Automorphic_While
{
    public static void main(String [] args)
    {
        Scanner ob = new Scanner (System.in);
        int n,m,i=0,z;
        System.out.println("Enter Your Number ");
        n = ob.nextInt();
        m=n*n;
        z=n;
        while(z>0)
        {
            i++;
            z=z/10;
        }
        int sum = (int)(m%(Math.pow(10,i)));
        if (n==sum)
        System.out.println("Automorphic Number ");
        else
        System.out.println("Not A Automorphic Number ");
    }
}