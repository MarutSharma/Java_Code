import java.util.*;
class Student2
{
    int rn = 720667 ;
    String name ;
    Scanner ob = new Scanner (System.in);
    void input()
    {
        System.out.println("Enter Name ");
        name = ob.nextLine();
        System.out.println("Enter Roll Number ");
        rn = ob.nextInt();
    }
    void display()
    {
        System.out.println("Name - "+name);
        System.out.println("Roll Number - "+rn);
    }
}
    public class child2 extends Student2
    {
        int m1,m2,m3,total;
        void input()
        {
            super.input();
            System.out.println("Enter Marks Of Maths ");
            m1 = ob.nextInt();
            System.out.println("Enter Marks Of Science ");
            m2 = ob.nextInt();
            System.out.println("Enter Marks Of Computer Science ");
            m3 = ob.nextInt();
        }
        void process()
        {
            total = m1+m2+m3;
        }
        void display()
        {
            super.display();
            System.out.println("Total Marks - "+total);
        }
        public static void main (String [] args)
        {
            child2 obj = new child2();
            obj.input();
            obj.process();
            obj.display();
        }
    }