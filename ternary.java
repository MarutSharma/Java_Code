import java.util.Scanner;
class ternary 
{
    public static void main (String [] args )
    {
        Scanner gr = new Scanner (System.in);
        int a, b, max;
        System.out.println("Enter Your Number ");
        a = gr.nextInt();
        System.out.println("Enter Your Number ");
        b = gr.nextInt();
        max = (a>b) ? a:b;
        System.out.println("The Largest Number Is "+max);
    }
}