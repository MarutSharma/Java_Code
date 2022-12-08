import java.util.Scanner;
public class testing4
{
public static void main(String []args)
{
Scanner reader = new Scanner(System.in);
String input;

do {
System.out.print("Please enter a 12 digit number:");
input = reader.nextLine();
}while( input.length()!=12);
System.out.println("Thanks.");
}
}
