import java.util.Scanner;
class mob
{
    public static void main(String[] args)
    {
        Scanner m = new Scanner(System.in);
        int c;
        double ch;
        System.out.println("Enter Number Of Call ");
        c = m.nextInt();
        if (c<=60){
            ch=c*0;
            System.out.println("Charge = "+ch);
        }
        else if(c<=100){
            ch=c*1;
            System.out.println("Charge = "+ch);
        }
        else if (c<=200){
            ch=c*80/100.0;
            System.out.println("Charge = "+ch);
        }
        else {
            ch=c*70/100.0;
            System.out.println("Charge = "+ch);
        }
    }
}