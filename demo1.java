import java.util.Scanner;
class demo1{
    public static void main(String [] args )
    {
        Scanner ob = new Scanner(System.in);
        int n  , d , m , o ,sum;
        System.out.println("Enter Number ");
        n = ob.nextInt();
        d = n/100%10;
        m = n/10%10;
        o= n%10;
        sum = m+o+d;
        System.out.println("split = "+sum);
    }
}