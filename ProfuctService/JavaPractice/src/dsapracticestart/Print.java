package dsapracticestart;

public class Print
{
    public static void main(String[] args) {
      String text="a2b3c4";
      StringBuilder sb=new StringBuilder();
      for(int i=0;i<text.length();i+=2)
      {
          char ch=text.charAt(i);
          int frequency=text.charAt(i+1)-'0';
          for(int j=1;j<=frequency;j++)
              sb.append(ch);
      }
        String answer = sb.toString();
        System.out.println(answer);
    }
}
