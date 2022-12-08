import java.util.Scanner;
class grosssal
{
    public static void main(String[] args)
    {
        Scanner y = new Scanner(System.in);
        char name;
        double p,da,ta,pf,gs;
        System.out.println("Enter Your Name  ");
        name = y.next().charAt(0);
        System.out.println("Enter Your Basic Salary ");
        p = y.nextDouble();
        if (p>=20000){
            da = p*54/100;
            ta = p*14/100;
            pf = p*10/100;
            gs = p+da+ta-pf;
            System.out.println("Gross Salary = "+gs);
        }
        else if (p<=20000){
            da = p*44/100;
            ta = p*15/100;
            pf = p*10/100;
            gs = p+da+ta-pf;
            System.out.println("Gross Salary = "+gs);
            
        }
        else {
            da = p*50/100;
            ta = p*10/100;
            pf = p*6/100;
            gs = p+da+ta-pf;
            System.out.println("Gross Salary = "+gs);
        }
    }
}