import java.util.Scanner;
class temp
{
    public static void main(String[] args)
    {
        Scanner tem = new Scanner(System.in);
        int a,b;
        System.out.println("Enter Value Of A");
        a = tem.nextInt();
        System.out.println("Enter value Of B ");
        b = tem.nextInt();
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("The Value Of A Is "+a);
        System.out.println("The Value Of B Is "+b);
        
    
    }
}