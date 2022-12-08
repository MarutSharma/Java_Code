import java.util.Scanner;
class buzz
{
    public static void main(String[] args)
    {
        Scanner b = new Scanner (System.in);
        int n,m;
        System.out.println("Enter Your Value ");
        n = b.nextInt();
        m = n%10;
        if  (m==7 || n%7==0 ) {
             System.out.println("Buzz Number ");
        }
        else {
            System.out.println("Not A Buzz Number ");
        }
    }
}