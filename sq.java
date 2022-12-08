import java.util.Scanner;
class sq
{
    public static void main(String[] args)
    {
        Scanner sq = new Scanner(System.in);
        int a,squ,cube;
        System.out.println("Enter Your Number ");
        a= sq.nextInt();
        squ=a*a;
        cube=a*a*a;
        System.out.println("Square Is "+squ);
        System.out.println("Cube Is "+cube);
    }
}