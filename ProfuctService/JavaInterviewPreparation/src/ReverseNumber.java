import java.util.Stack;

public class ReverseNumber
{
    public static void main(String[] args)
    {
    int number=1234;
        Stack<Integer>stack=new Stack<>();
    while(number!=0)
    {
        stack.push(number%10);
        number=number/10;
    }
    int reverse=0;
    int i=1;
    while(!stack.isEmpty())
    {
       reverse=reverse+(stack.peek()*i);
       stack.pop();
       i=i*10;
    }
        System.out.println(reverse);
    }
}
