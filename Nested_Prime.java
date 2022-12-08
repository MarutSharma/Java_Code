class Nested_Prime
{
    public static void main(String [] args )
    {
        int j;
        for(int i=2;i<=100;i++)
        {
            for(j=2;j<=i/2;j++)
            {
                if(i%j==0)
                {
                    j=i;
                    break;
                }
            }
            if(j!=i)
            System.out.println(i+" ");
        }
    }
}
    