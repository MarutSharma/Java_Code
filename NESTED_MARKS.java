import java.util.*;
public class NESTED_MARKS
{
    public static void main(String [] args )
    {
        Scanner ob = new Scanner(System.in);
        int i,j,r,m,l,n=0;
        for(i=1;i<=5;i++)
        {
            int tot = 0;
            System.out.println("Enter Roll Number ");
            r = ob.nextInt();
            for(j=1;j<=3;j++)
            {
                System.out.println("Enter  Marks of 3 Subjects");
                m = ob.nextInt();
                tot = tot+m;
            }
            if(tot>n)
            {
                n=tot;
                System.out.println("Greatest Total Marks is "+tot);
                System.out.println("Roll Number "+r);
            }
        }
    }
}