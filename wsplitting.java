import java.util.Scanner;
class wsplitting
{
    public static void main (String [] args)
    {
        Scanner ob = new Scanner (System.in);
        int n  ,d, sum = 0;
        System.out.println("Enter  Your Number  ");
        n = ob.nextInt();
        while (n>0){
        d = n%10;
        sum = sum + d;
        n = n/10;      
        }
        System.out.println("The Sum Of Number  = "+sum);  
    }
}