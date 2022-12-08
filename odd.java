import java.util.Scanner;
class odd
{
    public static void main(String[] args)
    {
        Scanner even = new Scanner(System.in);
        int a;
        System.out.println("Enter a Number");
        a = even.nextInt();
        if (a%2==0) {
            System.out.println("Even Number ");
        
        }
        else {
            System.out.println("Odd Number");
        }
    }
}