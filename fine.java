import java.util.Scanner;
class fine
{
    public static void main(String[] args)
    {
        Scanner f = new Scanner(System.in);
        int d, sum;
        System.out.println("Enter The Number of days ");
        d = f.nextInt();
        if (d<=5){
            sum = d*25/10;
            System.out.println("The Fine Is "+sum);
        }
        else if (d<=10){
            sum = d*35/10;
            System.out.println("The Fine Is "+sum);
        }
        else if (d<=15){
            sum = d*45/10;
            System.out.println("The Fine Is "+sum);
        }
        else {
            sum = d*5;
            System.out.println("The Fine Is "+sum);
        }
        }
        }