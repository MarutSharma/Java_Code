import java.util.Scanner;
class scase 
{
    public static void main (String [] args )
    {
        Scanner ob = new Scanner (System.in);
        int  l, b , h  , c , n;
        double s , r;
        System.out.println("Enter Choice ");
        n = ob.nextInt();
        switch (n){
            case 1:
                System.out.println("Enter Radius Of Sphere ");
                r = ob.nextDouble();
                s = 4.0/3.0 * (3.14 * r*r*r);
                System.out.println("The Volume Of Sphere "+s);
                break;
            case 2:
                System.out.println("Enter Length Of Cuboid  ");
                l = ob.nextInt();
                System.out.println("Enter Height Of Cuboid ");
                h = ob.nextInt();
                System.out.println("Enter Breadth Of Cuboid");
                b = ob.nextInt();
                c = l*b*h;
                System.out.println("The Volume Of Cuboid "+c);
                break;
            default:
                System.out.println("Invalid Input ");
               
        }
    }
}