import java.util.*;
class String_to_Int_pro
{
    public static void main(String [] args )
    {
        Scanner ob = new Scanner (System.in);
        String n;
        int i,l,sum=0;
        System.out.println("Enter String ");
        n=  ob.nextLine();
        l= n.length();
        for (i=0;i<l;i++)
        {
            char p = n.charAt(i);
            if (p>'0' && p<='9')
            sum = sum + (p-48);
        }
        System.out.println("The Sum Of Integer Part = "+sum);
    
    }
}