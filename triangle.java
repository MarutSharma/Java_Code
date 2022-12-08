import java.util.Scanner;
class triangle
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
        if (a+b>c && a+c>b && b+c>a){
            System.out.println("Possible Triangle ");
        }
        else {
            System.out.println("Triangle Not Possible ");
        }
    }
}