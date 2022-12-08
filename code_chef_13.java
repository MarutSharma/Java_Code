import java.util.*;
class code_chef_13
{
    public static void main(String [] args )
    {
        Scanner ob = new Scanner(System.in);
        int a,b,x,t,lum;
        t=ob.nextInt();
        for(int i=1;i<=t;i++)
        {
            a=ob.nextInt();
            b=ob.nextInt();
            x=ob.nextInt();
            lum=(b-a)/x;
            System.out.println(lum);
        }
    }
}