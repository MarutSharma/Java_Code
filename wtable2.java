import java.util.Scanner;
class wtable2 
{
    public static void main  ( String [] args )
    {
        Scanner ob = new Scanner (System.in);
        int n , i , sum ,a = 1;
        System.out.println("Enter Your Number ");
        n = ob.nextInt();
        System.out.println("Enter Your Number ");
        i = ob.nextInt();
        while (a<=i){
            sum = n*a;
            System.out.println(n+ "*" +a+ "=" +sum);
            a++;
        }
    }
}