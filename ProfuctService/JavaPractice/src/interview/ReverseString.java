package interview;

public class ReverseString
{
    public static void main(String[] args) {
        System.out.println(reverseString("Sumit"));
    }

    private static String reverseString(String sumit) {
        StringBuffer sb=new StringBuffer(sumit);
        return sb.reverse().toString();
    }
}
