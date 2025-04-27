package MethodReference;

public class MethodReference
{
    public static void saySomethingFromStatic()
    {
        System.out.println("Said something from static");
    }
    public void saySomethingFromInstance()
    {
        System.out.println("Said something from instance");
    }

    public static void main(String[] args)
    {
        Interface1 i1=MethodReference::saySomethingFromStatic;
        Interface1 i2=(new MethodReference())::saySomethingFromInstance;
        i1.saySomething();
        i2.saySomething();
    }
}
