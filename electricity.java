import java.util.Scanner;
class electricity
{
    public static void main(String[] args)
    {
        Scanner ec = new Scanner(System.in);
        int  n,sum;
        System.out.println("Enter Number Of Unit ");
        n = ec.nextInt();
        if (n<=100){
            sum = n*40/100+250;
            System.out.println("The Net Bill = "+sum);
            
        }
        else if (n<=200){
            sum = n*60/100+250;
            System.out.println("The Net Bill = "+sum);
        }
        else {
            sum = n*1+250;
            System.out.println("The Net Bill = "+sum);
        }
    }
}