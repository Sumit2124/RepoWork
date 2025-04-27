package debug;

public class B extends A
{
    public void display()
    {
        System.out.println("Displaying from B");
    }

    public static void main(String[] args) {
        B b=new B();
        b.display();
        A a=new B();
        a.display();
    }
}
