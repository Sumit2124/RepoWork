package interview.staticTesting;

public class B extends A
{
    public static void test()
    {
        System.out.println("testing from B");
    }

    public static void main(String[] args) {
        B b=new B();
        b.test();
    }
}
