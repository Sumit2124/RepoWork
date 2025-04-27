package ThreadProducerConsumer;

public class Company
{
    int n;
    boolean f=false;
    //if f->false producer chance
    // if f->true consumer chance
   synchronized public void produce_Item(int n)
    {
        if(f)
        {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        this.n=n;
        System.out.println("Produced: "+n);
        f=true;
        notify();

    }
   synchronized public void consume_item()
    {
        if(!f)
        {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Consumed: "+n);
        f=false;
        notify();
    }
}
