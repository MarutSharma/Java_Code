import java.util.Scanner;
class casetemp
{
    public static void main (String []  args)
    {
        Scanner ob = new Scanner (System.in);
        int n ;
        double c , f , k , f1 , c1 , c2;
        System.out.println("Enter Your Choice ");
        n = ob.nextInt();
        switch (n){
            case 1:
                System.out.println("Enter Temperture In Centigrade To Fahernheit");
                c = ob.nextDouble();
                f = 1.8*c+32;
                System.out.println("Temperture In Fahernheit ="+f);
                break;
            case 2:
                System.out.println("Enter Temperture In Fahrenheit To Centigrade ");
                f1 = ob.nextDouble();
                c1 = (f1-32)*5.0/9.0;
                System.out.println("Temperture In Centigrade ="+c1);
                break;
            case 3:
                System.out.println("Enter Temperture In Centigrade To Change In  Kelvin ");
                c2 = ob.nextDouble();
                k = c2+273;
                System.out.println("Temperture In Kelvin ="+k);
                break;
            default:
                System.out.println("Invalid Number ");
                
                
                
        }
        
    }
}