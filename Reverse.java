//PROGRAM FOR REVERSING THE NUMBER 
import java.util.*;
class Reverse
{
    public static void main(String [] args )
    {
        Scanner ob = new Scanner(System.in);
        int n,d,sum=0;
        System.out.println("Enter Number To Be Reversed");
        n = ob.nextInt();
        while(n!=0)//REVERSING CODE STARTS FROM HERE
        {
            d = n%10;
            sum = sum*10+d;
            n = n/10;
        }
        System.out.println("The Reversed Order Is "+sum);
    }
}
//BY MARUT SHARMA