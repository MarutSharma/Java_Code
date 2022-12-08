import java.util.*;
class TechNo
{
    public static void main(String args[])
    {
        int i,a,b,sum;
        for(i=1000;i<=9999;i++)
        {
            a=i/100;
            b=i%100;
            sum=(a+b)*(a+b);
            if(sum==i)
            System.out.println("Tech Number "+sum);
        }
    }
}