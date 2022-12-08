import java.util.Scanner;
class num
{
    public static void main(String[] args)
    {
        Scanner ms = new Scanner(System.in);
        int a,b,y,x;
        System.out.println("Enter First Value ");
        a = ms.nextInt();
        System.out.println("Enter Second Value ");
        b = ms.nextInt();
        if (a>b){
        x = a-b;
        System.out.println("A Is Greater And Difference is "+x);
    }
        else{
        y = b-a;
        System.out.println("B Is Greater And Difference Is "+y);
    }
    }
}