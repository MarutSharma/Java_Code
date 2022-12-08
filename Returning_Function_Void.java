import java.util.*;
class Returning_Function_Void 
{
    int process(int a , int b)
    {
        int sum ;
        sum = a+b;
        return sum;
    }
    public static void main(String [] args )
    {
        Scanner on = new Scanner (System.in);
        Returning_Function_Void obj = new Returning_Function_Void ();
        int n,m ; 
        System.out.println("Enter First  Number ");
        n = on.nextInt();
        System.out.println("Enter Second Number ");
        m = on.nextInt();
        int z = obj.process(n,m);
        System.out.println("Sum = "+z);
    }
}