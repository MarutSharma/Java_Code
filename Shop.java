import java.util.Scanner;
class Shop
{
    public static void main(String[] args)
    {
        Scanner mar = new Scanner(System.in);
        double a,gst,dis,x,y;
        System.out.println("Enter Your Amount ");
        a = mar.nextDouble();
        dis = 15/100.0*a;
        x = a-dis;
        gst = 5/100.0*x;
        y = x+gst;
        System.out.println(" Discount ="+dis); 
        System.out.println(" GST(After Discount) ="+gst);
        System.out.println("The Amount After Discount And Gst = "+y);
    }
}