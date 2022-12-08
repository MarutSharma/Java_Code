import java.util.Scanner;
class Sub
{
    public static void main(String[] args)
    {
        Scanner ob=new Scanner(System.in);
        int a,b,c,sum,avg,rs;
        System.out.println("Enter First Value ");
        a=ob.nextInt();
        System.out.println("Enter Second Value");
        b=ob.nextInt();
        System.out.println("Enter Third Value");
        c=ob.nextInt();
        sum=a+b+c;
        avg=sum/3;
        System.out.println("Sum Is "+sum);
        System.out.println("Average Is "+avg);
    }
}

