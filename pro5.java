import java.util.Scanner;
class pro5 
{
    public static void main (String [] args )
    {
        Scanner gr = new Scanner (System.in);
        int a, b, c , max;
        System.out.println("Enter First Number ");
        a = gr.nextInt();
        System.out.println("Enter Second Number ");
        b = gr.nextInt();
        System.out.println("Enter Third Number ");
        c = gr.nextInt();
        max =  (a > b) ? (a > c ? a : c) : (b > c ? b : c);  
        System.out.println("The largest numbers is:  "+max);  
    }
}