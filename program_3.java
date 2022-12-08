import java.util.Scanner;
class program_3 
{
    public static void main (String [] args )
    {
        Scanner ob = new Scanner (System.in);
        int n;
        double s , r , l , b , sq , cr , rec;
        System.out.println("Enter Choice ");
        n = ob.nextInt();
        switch (n){
            case 1:
                System.out.println("Enter Side Of Square ");
                s = ob.nextDouble();
                sq = s*s;
                System.out.println("Square = "+sq);
                break;
            case 2:
                System.out.println("Enter The Radius Of Circle ");
                r = ob.nextDouble();
                cr = 3.14 * r*r;
                System.out.println("The Area Of Circle  = "+cr);
                break;
            case 3:
                System.out.println("Enter Length Of Rectangle");
                l = ob.nextDouble();
                System.out.println("Enter The Breath Of Rectangle ");
                b = ob.nextDouble();
                rec = l*b;
                System.out.println("The Area Of Rectangle = "+rec);
                break;
            default:
                System.out.println("Invalid Number");
            }
        }
    }