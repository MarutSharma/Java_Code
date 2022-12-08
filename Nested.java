import java.util.*;
class Nested 
{
    public static void main(String [] args )
    {
        Scanner ob = new Scanner(System.in);
        int i,j,r,m,avg=0,l;
        for(i=1;i<=5;i++)
        {
            int tot =0,n=0;
            System.out.println("Enter Roll Number ");
            r = ob.nextInt();
            for(j=1;j<=3;j++)
            {
                System.out.println("Enter  Marks of 3 Subjects");
                m = ob.nextInt();
                tot = tot+m;
                avg = tot/3;
            }
            System.out.println("Total Marks "+tot);
            System.out.println("Average "+avg);
        }
    }
}