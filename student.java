import java.util.*;
class student
{
    public static void main(String[] args)
    {
        Scanner gr = new Scanner(System.in);
        int a,b,c,tot;
        System.out.println("Enter Maths Marks  ");
        a = gr.nextInt();
        System.out.println("Enter Science Marks  ");
        b = gr.nextInt();
        System.out.println("Enter Computer Science Marks  ");
        c = gr.nextInt();
        tot = a+b+c;
        if (a>=60 && b>=60 && c>=60 && tot>=210){
            System.out.println("Passed Excellent Work !");
        }
        else {
            System.out.println("Fail Fucked Up !");
        }
    }
}    