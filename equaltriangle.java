import java.util.Scanner;
class equaltriangle
{
    public static void main(String[] args)
    {
        Scanner t = new Scanner(System.in);
        double  a,b,c;
        System.out.println("Enter first Side Of Triangle ");
        a = t.nextDouble();
         System.out.println("Enter Second Side Of Triangle ");
        b = t.nextDouble();
         System.out.println("Enter Third Side Of Triangle ");
        c = t.nextDouble();
        if (a==b && b==c){
            System.out.println("Equaletral Triangle ");
        }
        else if (a==b || b==c || c==a){
            System.out.println("Isoceles Triangle ");
        }
        else {
            System.out.println("Scalen Triangle ");
        }
    }
}