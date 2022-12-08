import java.util.*;
class code_chef_9
{
    public static void main(String [] args)
    {
        Scanner ob = new Scanner(System.in);
        int t,x,y;
        t=ob.nextInt();
        for(int i=1;i<=t;i++)
        {
            x=ob.nextInt();
            y=ob.nextInt();
            if(y<=x)
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