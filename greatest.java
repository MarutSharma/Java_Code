import java.util.*;
class greatest
{
    public static void main(String[] args)
    {
        Scanner gr = new Scanner(System.in);
        int n1,n2,n3;
        System.out.println("Enter First Number  ");
        n1 = gr.nextInt();
        System.out.println("Enter Second Number  ");
        n2 = gr.nextInt();
        System.out.println("Enter Third  Number  ");
        n3 = gr.nextInt();
        if (n1>n2 && n1>n3){
            System.out.println("N1 is Greatest Number ");
        }
        else if (n2>n1 && n2>n3 ){
            System.out.println("N2 Is Greatest Number ");
        }
        else {
            System.out.println("N3 Is Greatest Number "+n3);
        }
    }   
} 