package interview;

public class GenerateOutput
{
    public static void main(String[] args)
    {
        String str="aabbbccc";
        if(str.length()==1)
        {
            System.out.println(str.charAt(0)+"1");
        }
        else
        {
            char previous=str.charAt(0);
            int curcount=1;
            String op="";
            for(int i=1;i<str.length();i++)
            {
                char current=str.charAt(i);
                if(current==previous)
                {
                    curcount++;
                }
                else {
                    op=op+previous+String.valueOf(curcount);
                    previous=current;
                    curcount=1;
                }
            }
            System.out.println(op+previous+curcount);

        }
    }
}
