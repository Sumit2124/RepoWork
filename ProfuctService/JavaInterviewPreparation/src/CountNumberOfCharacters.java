import java.util.HashMap;
import java.util.Map;

public class CountNumberOfCharacters
{
    public static void main(String[] args) {
        String str = "HiMyNameisSumitHowAreYouItsbeenalongtime";
        str = str.toLowerCase();
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        System.out.println(map);
    }
}
