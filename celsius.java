import java.util.Scanner;
class celsius
{
    public static void main(String[] args)
    {
        Scanner oz = new Scanner(System.in);
        char temp;
        double c,f,n;
        System.out.println("Enter C For Celsius And F For Fehrenhiet"); 
        temp = oz.next().charAt(0);
        if (temp=='f'){
            System.out.println("Enter Your Number ");
            n = oz.nextDouble();
            

            c =(( 5 *(n - 32.0)) / 9.0); 
            System.out.println("The Temperture In Celsius "+c);
        }
        else if (temp=='c'){
            System.out.println("Enter Your Number ");
            n = oz.nextDouble();

            f = 1.8*n+32; 
            System.out.println("The Temperture In Fehrenhiet "+f);
        }
        else {
            System.out.println("The Invalid Temp ");
            
        }
        }
}        