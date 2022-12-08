import java.util.*;
class code_chef_2
{
    public static void main(String[] args )
    {
        Scanner ob = new Scanner(System.in);
        int n,t;
        t=ob.nextInt();
        for(int i=1;i<=t;i++)
        {
            n=ob.nextInt();
            if(n>=7)
            {
                System.out.println("Yes");
            }
            else
            {
                System.out.println("No");
            }
        }
    }
}