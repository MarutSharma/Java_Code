import java.util.*;
class tryuuu
{
    public static void main(String arr[])
    {
        char ch;
        String str;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any String ");
        str=sc.nextLine();
        str=str.toUpperCase();
        System.out.println("CHARACTER\tFREQUENCY");
        for(ch='A';ch<='Z';ch++)
        {
            int count=0;
            for(int a=0;a<str.length();a++)
            {
                if(str.charAt(a)==ch)
                    count++;
            }
            if(count>0)
            {
                    System.out.println(ch+"\t\t"+count);
            }
        }
    }
}

