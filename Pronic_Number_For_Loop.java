import java.util.*;
class Pronic_Number_For_Loop
{
    public static void main(String [] args )
    {
        Scanner ob = new Scanner (System.in);
        int n=0 , p=1;
        for (int i =1;i<=10;i++)
        {
            p = i*(i+1);
            System.out.println(p);
        }
    }
}