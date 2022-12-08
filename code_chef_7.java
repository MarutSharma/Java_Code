import java.util.*;
class code_chef_7
{
    public static void main(String[] args )
    {
        Scanner ob = new Scanner(System.in);
        int t,x,h;
        t=ob.nextInt();
        for(int i =1;i<=t;i++)
        {
            x=ob.nextInt();
            h=ob.nextInt();
            if(x>=h)
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