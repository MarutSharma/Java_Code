import java.util.*;
class code_chef_1
{
    public static void main(String[] args)
    {
        Scanner ob = new Scanner(System.in);
        int t,x,y,sub;
        System.out.println("Enter Test Case");
        t=ob.nextInt();
        for(int i=1;i<=t;i++)
        {
            System.out.println("Enter Target For Team B");
            x=ob.nextInt();
            System.out.println("Enter Current Score Of Team B");
            y=ob.nextInt();
            sub=x-y;
            System.out.println(sub);
        }
    }
}