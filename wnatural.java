import java.util.Scanner;
class wnatural
{
    public static void main (String [] args)
    {
        Scanner ob = new Scanner (System.in);
        int n , i = 1 , sum=0;
        System.out.println("Enter A Number ");
        n = ob.nextInt();
        while (i<=n){
            sum=sum+i;
            System.out.println(+sum);
            i++;
        }
    }
}