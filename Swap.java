import java.util.Scanner;
class Swap
{
    public static void main(String[] args )
    {
        Scanner swaping = new Scanner(System.in);
        int a,b;
        int c;
        System.out.println("Enter Your Value Of A");
        a= swaping.nextInt();
        System.out.println("Enter Your Value Of B");
        b= swaping.nextInt();
        c=a;
        a=b;
        b=c;
        System.out.println("The Value Of A Is "+a);
        System.out.println("The Value Of B Is "+b);
    }
}