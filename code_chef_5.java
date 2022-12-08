import java.util.*;
class code_chef_5
{
    public static void main(String[] args)
    {
        Scanner ob = new Scanner(System.in);
        int t,x;
        t=ob.nextInt();
        for(int i=1;i<=t;i++)
        {
            x=ob.nextInt();
            if(x>=67 && x<=45000)
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