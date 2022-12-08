import java.util.*;
class code_chef_4
{
    public static void main(String[] args )
    {
        Scanner ob = new Scanner(System.in);
        int t,a,b,sum;
        t=ob.nextInt();
        for(int i=1;i<=t;i++)
        {
            a=ob.nextInt();
            b=ob.nextInt();
            sum=a+b;
            System.out.println(sum);
        }
    }
}