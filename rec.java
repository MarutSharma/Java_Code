import java.util.Scanner;
class rec 
{
    public static void main(String[] args)
    {
        Scanner rec = new Scanner(System.in);
        double l,b,area,para;
        System.out.println("Enter Length Of Rectangle");
        l= rec.nextDouble();
        System.out.println("Enter Breadth Of Rectanle");
        b=rec.nextDouble();
        area=l*b;
        para=2*(l+b);
        System.out.println("Area Of Rectangle Is "+area);
        System.out.println("Parameter Of Rectangle "+para);
        
        
    }
}