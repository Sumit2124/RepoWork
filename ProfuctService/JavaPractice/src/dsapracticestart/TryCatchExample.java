package dsapracticestart;

public class TryCatchExample
{
    public static void main(String[] args)
    {
     try
     {
         int a =10/0;
     }
     finally {
         System.out.println("Finally");
     }
    }
}
