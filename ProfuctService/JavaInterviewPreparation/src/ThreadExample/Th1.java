package ThreadExample;

public class Th1 implements  Runnable
{
    @Override
    public void run()
    {
    for(int i=1;i<=100;i+=2)
        System.out.println(i);
    }

    public static void main(String[] args) {
        Th1 thread=new Th1();
        Thread th=new Thread(thread);
        th.start();
    }
}
