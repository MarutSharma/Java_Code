import java.util.Scanner;
class Positive_Negative_For_Loop
{
    public static void main(String [] args )
    {
        Scanner ob = new Scanner (System.in);
        int n,a,sum=0,z=0,y=0;
        for (a=1;a<=10;a++)
        {
            System.out.println("Enter "+a+ "\t Number ");
            n = ob.nextInt();
            if (n>=1){
           System.out.println("Positive Number ");
           z++;
        }
           else {
           System.out.println("Negative Number ");
           y++;
        }
        }
        System.out.println("Positive Number Are --"+z);
        System.out.println("Negative Number Are --"+y);
    }
}