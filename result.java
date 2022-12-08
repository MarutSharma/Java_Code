import java.util.Scanner;
class result
{
    public static void main(String[] args)
    {
        Scanner r = new Scanner(System.in);
        int  roll,c,m,e,tot;
        char gr;
        double p;
        System.out.println("Enter Your Roll Number ");
        roll = r.nextInt();
        System.out.println("Enter Your Computer Marks  ");
        c = r.nextInt();
        System.out.println("Enter Your Maths Marks  ");
        m = r.nextInt();
        System.out.println("Enter Your English Marks  ");
        e = r.nextInt();
        tot = c+e+m;
        p = tot/300.0*100;
        if (p<=50){
            System.out.println("Roll Number : "+roll);
            System.out.println("Computer Marks  : "+c);
            System.out.println("Maths Marks  : "+m);
            System.out.println("English Marks : "+e);
            System.out.println("Total Marks  = "+tot);
            System.out.println("Percentage = "+p);
            System.out.println("Grade = D ");
        }
        else if (p<=60){
            System.out.println("Roll Number : "+roll);
            System.out.println("Computer Marks  : "+c);
            System.out.println("Maths Marks  : "+m);
            System.out.println("English Marks : "+e);
            System.out.println("Total Marks  = "+tot);
            System.out.println("Percentage = "+p);
            System.out.println("Grade = C ");
            
        }
        else if (p<=80){
            System.out.println("Roll Number : "+roll);
            System.out.println("Computer Marks  : "+c);
            System.out.println("Maths Marks  : "+m);
            System.out.println("English Marks : "+e);
            System.out.println("Total Marks  = "+tot);
            System.out.println("Percentage = "+p);
            System.out.println("Grade = B ");
        }
        else {
            System.out.println("Roll Number : "+roll);
            System.out.println("Computer Marks  : "+c);
            System.out.println("Maths Marks  : "+m);
            System.out.println("English Marks : "+e);
            System.out.println("Total Marks  = "+tot);
            System.out.println("Percentage = "+p);
            System.out.println("Grade = A ");
        }
    }
}
 