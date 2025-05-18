package collections;

public class Singleton
{
    private int id;
    private static Singleton singletonObject=null;
    private Singleton()
    {
        id=10;
    }
    public static Singleton getInstance()
    {
     if(singletonObject==null)
         singletonObject=new Singleton();
     return singletonObject;
    }

    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        System.out.println(instance.id);
    }
}
