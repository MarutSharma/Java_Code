import java.util.*;
class code_chef_3
{
    public static void main(String[] args)
    {
        Scanner ob = new Scanner(System.in);
        int t,x,y,sub;
        t=ob.nextInt();
        for(int i=1;i<=t;i++)
        {
            x=ob.nextInt();
            y=ob.nextInt();
            if(x<y)
            {
                sub=y-x;
                System.out.println(sub);
            }
            else
            {
                System.out.println(0);
            }
        }
    }
}