package dsapracticestart;

public class CallByValueAndReference
{
    public void change(int a)
    {
        a=a+10;
    }
    public static void main(String[] args)
    {
    CallByValueAndReference cbvr=new CallByValueAndReference();
    int a=100;
    cbvr.change(a);
        System.out.println(a);
    }
}
