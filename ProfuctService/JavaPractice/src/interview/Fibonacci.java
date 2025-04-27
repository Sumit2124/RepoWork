package interview;

public class Fibonacci
{
    public static void main(String[] args) {
        int values=10;
        int i=0;
        int a=0;
        int b=1;
        System.out.print(a+" "+b+" ");
        for(i=1;i<=values-2;i++)
        {
            int c=a+b;
            a=b;
            b=c;
            System.out.print(c+" ");
        }
    }
}
