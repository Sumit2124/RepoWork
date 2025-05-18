public class StringSwapping
{
    public static void main(String[] args) {
        String str1="Sumit";
        String str2="Raghav";
        str1=str1+str2;
        int totalLength=str1.length();
        str2=str1.substring(0,(totalLength-str2.length()));
        str1=str1.substring(str2.length());
        System.out.println(str1+" "+str2);
    }
}
