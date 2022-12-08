import java.util.*;
class ProductSumWhileLoop
{
    public static void main (String [] args )
    {
        Scanner ob = new Scanner (System.in);
        int i=1,n,pro=0, avg=0 ;
        System.out.println("Enter Your Number ");
        n = ob.nextInt();
        while (i<=n)
        {
            pro = pro+i;
            avg = pro/n;
            i++;
            
        }
        System.out.println("The Average Of Number = "+avg);
        System.out.println("The Product Of Number = "+pro);
        
}
}