import java.util.*;
class Student1
{
    int rn ;
    String name ;
    Scanner ob = new Scanner (System.in);
    void input1()
    {
        System.out.println("Enter Name ");
        name = ob.nextLine();
        System.out.println("Enter Roll Number ");
        rn = ob.nextInt();
    }
    void display1()
    {
        System.out.println("Name - "+name);
        System.out.println("Roll Number - "+rn);
    }
}
    public class child extends Student1
    {
        int m1,m2,m3,total;
        void input2()
        {
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
        void display2()
        {
            System.out.println("Total Marks - "+total);
        }
        public static void main (String [] args)
        {
            child obj = new child();
            obj.input1();
            obj.input2();
            obj.process();
            obj.display1();
            obj.display2();
        }
    }