package interview;

public class CountCharacters {
    public static void main(String[] args) {
        String str = "Hi My name is Sumit how are you?";
        str = str.toLowerCase();
        int num[] = new int[27];
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch >= 97 && ch <= 122) {
                num[ch - 97 + 1]++;
            }
        }
        for (int i=0;i<num.length;i++)
        {
            System.out.println((char)(i+96)+ " "+num[i]);
        }

    }
}
