import java.util.Date;
class TestDemo
{
    public static void main(String[] args)
    {
        Thread t = new Thread()
        {
            public void run()
            {
                while(true)
                {
                    System.out.println(new Date());
                    try
                    {
                        Thread.sleep(1000);
                    }catch(Exception e){}
                }
            }
        };
        t.start();
    }
}
