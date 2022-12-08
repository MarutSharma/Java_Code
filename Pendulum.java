import java.lang.Math;
import java.util.Scanner;
class Pendulum
{
    public static void main(String[] args)
    {
        Scanner pen = new Scanner(System.in);
        double l,g,t;
        System.out.println("Enter Length ");
        l= pen.nextDouble();
        System.out.println("Enter Acceleration Due To Gravity");
        g= pen.nextDouble();
        t=2*3.14159*Math.sqrt(l/g);
        System.out.println("Time Peroid Of Pendulum "+t);
    }
}