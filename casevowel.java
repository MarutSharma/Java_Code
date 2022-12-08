import java.util.Scanner;
class casevowel
{
    public static void main (String [] args)
    {
        Scanner ob = new Scanner (System.in);
        char n , n1 ;
        System.out.println("Enter Any Alhabhet ");
        n = ob.next().charAt(0);
        switch (n){
            case 'a':
            case 'A':
            case 'e':
            case 'E':
            case 'i':
            case 'I':
            case 'o':
            case 'O':
            case 'u':
            case 'U':
            System.out.println("Vowels");
            break;
            default:
                System.out.println("Consonats");
        }
    }
}