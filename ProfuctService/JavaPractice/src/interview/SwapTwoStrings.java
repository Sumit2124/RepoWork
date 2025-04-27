package interview;

import static java.util.Collections.swap;

public class SwapTwoStrings {
    public static void main(String[] args) {
        String s1 = "a";
        String s2 = "bc";
        s1 = s1 + s2;
        s2=s1.substring(0,s1.length()-s2.length());
        s1=s1.substring(s2.length());
        System.out.println(s1+" "+s2);

    }

}
