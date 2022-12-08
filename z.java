import java.util.Scanner;
class z
{
    public static void main(String[] args)
    {
        Scanner ze = new Scanner(System.in);
        int num;
        System.out.println("Enter Your Number ");
        num = ze.nextInt();
        if (num>0){
            System.out.println("Positive Number ");
        }
        else if (num<0) {
            System.out.println("Negative Number ");
        }
        
        
        else{
            System.out.println("Zero");    
        }
    }
}