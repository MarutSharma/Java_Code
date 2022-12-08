interface first
{
    public abstract void test();
}
public class abc1 implements first
{
    public void test()
    {
        System.out.println("Fuck the Ass");
    }
    public static void main (String [] args )
    {
        abc1 obj = new abc1();
        obj.test();
    }
}