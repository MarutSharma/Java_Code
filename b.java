abstract class a
{
    void p()
    {
        System.out.println("Fuck ");
    }
    abstract void z();
}
public class b extends a
{
    void z()
    {
        System.out.println("Hello Java ");
    }
    void l()
    {
        System.out.println("Hello C Language ");
    }
    public static void main(String [] args )
    {
        b obj = new b();
        obj.p();
        obj.z();
        obj.l();
    }
}