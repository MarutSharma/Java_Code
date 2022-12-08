import java.util.*;
class code_chef_14
{
    public static void main(String []args)
    {
        Scanner ob = new Scanner(System.in);
        int d,l,r,t;
        t=ob.nextInt();
        for(int i=1;i<=t;i++)
        {
            d=ob.nextInt();
            l=ob.nextInt();
            r=ob.nextInt();
            if(d>=l && d<=r)
            {
                System.out.println("Take second dose now");
            }
            else if (d>r)
            {
                System.out.println("Too Late");
            }
            else if (d<l)
            {
                System.out.println("Too Early");
            }
        }
    }
}