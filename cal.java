import java.util.Scanner;
class cal
{
    public static void main(String[] args)
    {
        Scanner cal= new Scanner(System.in);
        double a,b,add,multi,sub,div,rem;
        System.out.println("Enter First Value ");
        a=cal.nextDouble();
        System.out.println("Enter Second Value ");
        b=cal.nextDouble();
        add=a+b;
        multi=a*b;
        sub=a-b;
        div=a/b;
        rem=a%b;
        System.out.println("Addition Of Value Is "+add);
        System.out.println("Multiplication Of Value Is "+multi);
        System.out.println("Substration Of Value Is "+sub);
        System.out.println("Division Of Value Is "+div);
        System.out.println("Remainder Of Value Is "+rem); 
    }
}