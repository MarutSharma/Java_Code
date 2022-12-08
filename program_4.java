import java.util.Scanner;
class program_4 
{
    public static void main (String [] args )
    {
        Scanner ob = new Scanner (System.in);
        int n;
        double c , r , l , b , cube , cone , cb , h , h1;
        System.out.println("Enter Choice ");
        n = ob.nextInt();
        switch (n){
            case 1:
                System.out.println("Enter Side Of Square ");
                c = ob.nextDouble();
                cube = c*c*c;
                System.out.println("Square = "+cube);
                break;
            case 2:
                System.out.println("Enter The Radius Of Cone ");
                r = ob.nextDouble();
                System.out.println("Enter The Height Of Cone ");
                h = ob.nextDouble();
                cone = 1.0/3.0*3.14 * r*r * h;
                System.out.println("The Area Of Circle  = "+cone);
                break;
            case 3:
                System.out.println("Enter Lenght Of Cuboid");
                l = ob.nextDouble();
                System.out.println("Enter The Breaht Of Cuboid ");
                b = ob.nextDouble();
                System.out.println("Enter The Height Of Cuboid ");
                h1 = ob.nextDouble();
                cb = l*b*h1;
                System.out.println("The Area Of Rectangle = "+cb);
                break;
            default:
                System.out.println("Invalid Number");
            }
        }
    }