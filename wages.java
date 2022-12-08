import java.util.Scanner;
class wages
{
    public static void main(String [] args )
    {
        Scanner w = new Scanner(System.in);
        int h,sum,sumz;
        System.out.println("Enter Hours ");
        h = w.nextInt();
        if (h<=20) {
            sum = h*40;
            System.out.println("Wages Are Rs "+sum);
        }
        else {
            sumz = h*80;
            System.out.println("Wages Are Rs "+sumz);
        }
    }
}