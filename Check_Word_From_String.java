import java.util.*;
class Check_Word_From_String
{
    public static void main(String [] args )
    {
        Scanner ob = new Scanner (System.in);
        String n;
        int i,l,sum=0;
        System.out.println("Enter String ");
        n=  ob.nextLine();
        n = n.toUpperCase();
        l= n.length();
        for (i=0;i<l;i++)
        {
            char p = n.charAt(i);
            if (p>'A' && p<='Z')
            System.out.println("Word Are Present ");
            else
            System.out.println("No Word Are Present ");
            System.exit(0);
        }
        
    }
}