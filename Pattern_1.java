import java.util.*;
class Pattern_1                        
{
    public static void main(String args[])
    {
        Scanner ob=new Scanner(System.in);
        int i,j;
        for(i=4;i>=1;i--)
        {  
            for(j=i;j>=1;j--)
            {
                System.out.print(j);
            }
            System.out.println("  ");
        }
    }
}