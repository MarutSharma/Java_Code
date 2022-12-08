import java.util.*;
class Big
{
    public static void main(String [] args )
    {
        Scanner ob = new Scanner(System.in);
        int n ,big = 1,tot = 0,avg=0;
        String name;
        for(int i =0; i<=2;i++)
        {
            System.out.println("Enter Amount Donated ");
            n = ob.nextInt();
            System.out.println("Enter Name ");
            name = ob.nextLine();
            tot = tot+n;
            avg = tot/2;
            if(big<n)
            big = n;
        }
        
        System.out.println("Highest Amount Is"+big);
        System.out.println("Total Amount Collected Is "+tot);
        System.out.println("Average Contribution Of Each Donar Is "+avg);
    }
}