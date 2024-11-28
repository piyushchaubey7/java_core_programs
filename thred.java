class a extends Thread
{
    int i;
    public void run()
    {
        for(i=0;i<=4;i++)
        {
            System.out.print("piyush");
        }
    }

    public static void main(String[] agr)
    {
        int i;
        a t= new a();
        t.start();
        for(i=0;i<=4;i++)
        {
            System.out.print("chaubey");

        }
    }
}
