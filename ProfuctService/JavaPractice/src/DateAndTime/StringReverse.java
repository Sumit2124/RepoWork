package DateAndTime;

public class StringReverse
{
    public static void main(String[] args) {
        String str="ABCD";
        method1(str);
        method2(str);
    }

    private static void method2(String str)
    {
        System.out.print("From method 2 ");
        String s="";
        for(int i=0;i<str.length();i++)
        {
            s=str.charAt(i)+s;
        }
        System.out.println(s);
    }

    private static void method1(String str)
    {
        System.out.print("From method 1 ");
        StringBuffer sb=new StringBuffer();
        for(int i=str.length()-1;i>=0;i--)
        {
            sb.append(str.charAt(i));
        }
        System.out.println(sb.toString());
    }
}
