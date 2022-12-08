import java.util.*;
class Automorphic_Function_Program
{
    void Morphic(int num)
    {
        int i=0,m,z;
        z = num;
        m = num*num;
        while(num>0)
        {
            num = num/10;
            i++;
        }
        int sum = (int)(m%(Math.pow(10,i)));
        if (z==sum)
        System.out.println("Automorphic Number ");
        else 
        System.out.println("Not Automorphic Number ");
    }
    public static void main(String [] args )
    {
        Scanner ob = new Scanner (System.in);
        Automorphic_Function_Program obj = new Automorphic_Function_Program();
        int n;
        System.out.println("Enter Number ");
        n = ob.nextInt();
        obj.Morphic(n);
    }
}