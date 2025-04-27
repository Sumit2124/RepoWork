package dsapracticestart.thread;

import java.util.Random;

public class ThreadExample implements Runnable
{
    @Override
    public void run() {
        for(int i=1;i<=100;i+=2)
        {
            System.out.println(i+" "+Thread.currentThread().getName());

        }

    }

    public static void main(String[] args) {
        ThreadExample threadExample=new ThreadExample();
        Thread th=new Thread(threadExample);
        th.start();
    }
}
