package ThreadProducerConsumer;

public class Producer extends Thread
{
    Company c;

    Producer(Company c)
    {
        this.c=c;
    }
    @Override
    public void run() {
        int i=1;
    while(true)
    {
        c.produce_Item(i);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        i++;
    }
    }
}
