import java.util.Scanner; 
class exp
{
    public static void main(String[] args )
    {
        Scanner ex = new Scanner(System.in);
        double A,B,C,X,Y;
        System.out.println("Enter Your First Value ");
        A= ex.nextDouble();
        System.out.println("Enter Your Second Value ");
        B= ex.nextDouble();
        System.out.println("Enter Your Third Value ");
        C= ex.nextDouble();
        X= Math.sqrt(A*A+B*B+C*C);
        Y= Math.sqrt(A*B+B*A);
        System.out.println("The Value Of X Is "+X);
        System.out.println("The Value Of Y Is "+Y);
    }
}