import java.util.*;
class Cricket_For_Loop
{
    public static void main(String [] args )
    {
    Scanner ob = new Scanner (System.in);
    int sum =0 ,avg,large=0;
    for (int i = 1; i<=11 ; i++)
    {
    System.out.println("Enter Score Of" +i+ "Players ");
    int n = ob.nextInt();
    large = n;
    if (n>large)
    {
        large = n;
    }
    sum = sum + n;
    }
    avg = sum/11;
    System.out.println("Highest individual score of the team "+large);
    System.out.println("Total Run Scored By Team = "+sum);
    System.out.println(" Average Runs scored by Players = "+avg);  
}
}