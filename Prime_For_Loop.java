import java.util.Scanner;
public class Prime_For_Loop {
  public static void main(String[] args) { 
    Scanner ob = new Scanner(System.in);
    int num ;
    System.out.println("Enter Your Number ");
    num = ob.nextInt();
    boolean flag = false;
    for (int i = 2; i <= num / 2; ++i) {
      
      if (num % i == 0) {
        flag = true;
        break;
      }
    }
    if (!flag)
      System.out.println(num + " is a prime number.");
    else
      System.out.println(num + " is not a prime number.");
  }
}