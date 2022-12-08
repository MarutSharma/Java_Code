import java.util.*;
class Perfect_Function_Number 
{
    void Perfect(int num)
    {
        int i,sum = 0,z;
        z = num;
        for (i=1;i<num;i++)
        {
            if (num%i==0)
            sum = sum + i;
        }
        if (z == sum)
        System.out.println("Perfect Number ");
        else 
        System.out.println("Not Perfect Number ");
    }
    public static void main(String [] args )
    {
        Scanner on = new Scanner (System.in);
        Perfect_Function_Number  obj = new Perfect_Function_Number();
        int n;
        System.out.println("Enter Number ");
        n = on.nextInt ();
        obj.Perfect(n);
    }
}