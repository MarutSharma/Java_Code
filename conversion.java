import java.util.Scanner;
class conversion
{
    public static void main(String [] args)
    {
        Scanner p = new Scanner(System.in);
        char temp;
        double m,o,n;
        System.out.println("Enter C For Celsius And F For Ferenhiet ");
        temp = p.next().charAt(0);
        System.out.println("Enter Number ");
        n = p.nextDouble();
        if (temp=='f'){
            m = (n-32)*5/9;
            System.out.println("The Temperture In Celsius = "+m);
            
        }
        else if (temp=='c')
        {
            o = 1.8*n+32;
            System.out.println("The Temperture In Fehrenhiet "+o);
        }
        else {
            System.out.println("Invalid Input");
        }
    }
}