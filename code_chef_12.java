import java.util.*;
class code_chef_12
{
    public static void main(String [] args )
    {
        Scanner on = new Scanner(System.in);
        int t,x,sum;
        t=on.nextInt();
        for(int i=1;i<=t;i++)
        {
            x=on.nextInt();
            if(x>100)
            {
                sum=x-10;
                System.out.println(sum);
            }
            else
            {
                System.out.println(x);
            }
        }
    }
}