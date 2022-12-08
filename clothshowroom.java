import java.util.Scanner;
class clothshowroom
{
    public static void main(String[] args)
    {
        Scanner c = new Scanner(System.in);
        int  n,sum,p;
        System.out.println("Enter Total Cost  ");
        n = c.nextInt();
        if (n<=2000){
            sum = n*5/100;
            p = n-sum;
            System.out.println("The Total Cost After Discount = "+p);
        }
        else if (n<=5000){
            sum = n*25/100;
            p = n-sum;
            System.out.println("The Total Cost After Discount = "+p);
        }
        else if (n<=10000){
            sum = n*35/100;
            p = n-sum;
            System.out.println("The Total Cost After Discount = "+p);
        }
        else {
            sum = n*50/100;
            p = n-sum;
            System.out.println("The Total Cost After Discount = "+p);
        }
    }
}
        
 