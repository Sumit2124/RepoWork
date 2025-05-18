package ThreadExample;

public class Th2 extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 100; i += 2)
            System.out.println(i);
    }

    public static void main(String[] args) {
        Th2 thread=new Th2();
        thread.start();

    }
}
