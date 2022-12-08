class function_demo
{
    void process()
    {
        int i;
        for (i=1;i<=40;i++)
        {
            System.out.print("@#");
        }
        System.out.println();
    }
    public static void main(String [] args )
    {
        function_demo obj = new function_demo();
        System.out.println("Lucknow");
        obj.process();
        System.out.println("Mumbai");
        obj.process();
        System.out.println("National");
        obj.process();
    }
}