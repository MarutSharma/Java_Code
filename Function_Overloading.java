class Function_Overloading 
{
    void Add(int  a , double b)
    {
        System.out.println("Sum Double = "+(a+b));
    }
    void Add (int a ,float  b)
    {
        System.out.println("Sum Float = "+(a+b));
    }
    public static void main(String [] args )
    {
        Function_Overloading obj = new Function_Overloading();
        obj.Add(10,10.20f);
    }
}