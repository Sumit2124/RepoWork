package java8.FunctionalInterface;

public class RunnableTest
{
    public static void main(String[] args)
    {
    Runnable runnable=()->{
        System.out.println("Runnable executed");
    };
    runnable.run();
    }
}
