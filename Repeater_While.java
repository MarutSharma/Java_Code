import java.util.Scanner;
class Repeater_While 
{
    public static void main (String [] args )
    {
        Scanner ob = new Scanner (System.in);
        int n,i=1,res=0 ;
        System.out.println("Enter Your Value ");
        n = ob.nextInt ();
        while (i<=n){
            res = res*10+n;
            i++;   
        }
        System.out.println(res+1);
    }
}