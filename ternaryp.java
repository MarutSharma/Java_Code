import java.util.*;
import java.lang.Math;
class ternaryp 
{
    public static void main (String [] args )
    {
        Scanner gr = new Scanner (System.in);
        double a, b, store;
        System.out.println("Enter Your Number ");
        a = gr.nextDouble();
        System.out.println("Enter Your Number ");
        b = gr.nextDouble();
        store = (a>b) ? (Math.pow(a,b)) : (Math.sqrt(b));
        System.out.println("The Result = "+store);
    }
}