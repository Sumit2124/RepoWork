public class GenerateOutput
{
    public static void main(String[] args) {
        String str="aabbbccccddef";
        int count=1;
        char currentch=' ',nextch=' ';
        for(int i=0;i<str.length()-1;i++)
        {
             currentch=str.charAt(i);
             nextch=str.charAt(i+1);
            if(currentch==nextch)
            {
                count++;
            }
            else{
                System.out.print(currentch);
                System.out.print(count);
                count=1;
            }

        }
        System.out.print(nextch);
        System.out.println(count);
    }
}
