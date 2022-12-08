import java.util.*;
class String123
{
    public static void main(String args [])
    {
        Scanner ob=new Scanner (System.in);
        String n,s;
        int v=0,c=0,i;
        System.out.println(" Enter The String ");
        n=ob.nextLine();
        s=n.toLowerCase( );
        int l=s.length();
        for(i=0;i<l;i++)
        {
            char p=n.charAt(i);
              if(p>='a' && p<='z')
              {
                if(p=='a' || p=='e' || p=='i' || p=='o' || p=='u')
                {
                  v++;
                }
                else 
                {
                    c++;             
                }
             }
         }
        System.out.println( " Vowels " +v);
        System.out.println(" Consonent " +c);
    }
}