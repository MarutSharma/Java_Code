import java.util.*;
class code_chef_6
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
            if(x<y)
            {
                System.out.println("B");
            }
            else if(x>y)
            {
                System.out.println("A");
            }
            else
            {
                
            }
        }
    }
}