import java.util.Scanner;
class wtable 
{
    public static void main  ( String [] args )
    {
        Scanner ob = new Scanner (System.in);
        int n , i = 1 , sum;
        System.out.println("Enter Your Number ");
        n = ob.nextInt();
        while (i<=10){
            sum = n*i;
            System.out.println(n+ "*" +i+ "=" +sum);
            i++;
        }
    }
}