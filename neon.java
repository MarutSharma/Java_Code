import java.util.Scanner;
class neon
{
    public static void main(String[] args)
    {
        Scanner n = new Scanner(System.in);
        int num ,o,m,sq;
        System.out.println("Enter Your Number(Only In Single digit)");
        num = n.nextInt();
        sq = num * num;
        o = sq/10;
        m = sq%10;
        if (m+o==num){
            System.out.println("Neon Number ");
        }
        else {
            System.out.println("Not A Neon Number");
        }
    }
}