import java.util.*;
class cab 
{
    int cabno,km,bill;
    long code;
    Scanner on = new Scanner(System.in);
    cab()
    {
        this.cabno=cabno;
        this.km=km;
        this.code=code;
    }
    void input()
    {
        System.out.println("Enter Cab Number ");
        cabno = on.nextInt();
        System.out.println("Enter Kilometer Travelled ");
        km = on.nextInt();
        System.out.println("Enter Passanger Code ");
        code = on.nextLong();
    }
    double billamount()
    {
        if (km==1)
        {
            bill = km*5;
        }
        if (km>1 && km<=6)
        {
            bill = km*10;
        }
        if (km>6 && km<=12)
        {
            bill = km*15;
        }
        if ( km>12)
        {
            bill = km*20;
        }
        return bill;
    }
    void display()
    {
        double z = billamount();
        System.out.println("Cab Number - " +cabno+ "\tKilometer Travelled - " +km+ "\tBill Amount - " +z);
    }
    public static void main (String [] args )
    {
        cab obj = new cab();
        obj.input();
        obj.display();
    }
}