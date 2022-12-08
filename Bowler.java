import java.util.*;
class Bowler
{
    public static void main(String [] args )
    {
        Scanner ob = new Scanner(System.in);
        int tot,wic,in,i,avg,avgw;
        System.out.println("Enter N or n To exit Or To Continue Press Any Key ");
        char z = ob.next().charAt(0);
        char x = Character.toUpperCase(z);
        for (i=0;x!='N';i++)
        {
            System.out.println("Enter Total Number Of Score ");
            tot = ob.nextInt();
            System.out.println("Enter Wickets ");
            wic = ob.nextInt();
            System.out.println("Enter Inning Played");
            in = ob.nextInt();
            System.out.println("Enter N or n To exit Or To Continue Press Any Key ");
            z = ob.next().charAt(0);
            x = Character.toUpperCase(z);
            avg = tot/in;
            avgw = wic/in;
            if (avg>=40 && avgw>=3)
            {
                System.out.println("All Rounder ");
            }
            if (avg>=50 )
            {
                System.out.println("Batsman");
            }
            if (avgw>=4)
            {
                System.out.println("Bowler");
            }
            else
            {
                System.out.println("Fielder");
            }
            
    }
}
}