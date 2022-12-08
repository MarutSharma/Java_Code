class Grandfather
{
    Grandfather()
    {
        System.out.println("Grandfather Constructor ");
    }
}
class Father extends Grandfather
{
    Father()
    {
        System.out.println("Father Constructor ");
    }
}
public class son extends Father
{
    son()
    {
        System.out.println("Son Constructor ");
    }
    public static void main(String [] args )
    {
        son obj = new son();
    }
}