package interview;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class GetCount
{
    public static void main(String[] args)
    {
        Map<String,Integer> map=new HashMap<>();
        String str="Geeks for Geeks";
        Stream<Character> characterStream = IntStream.range(0, str.length()).mapToObj(i -> Character.valueOf(str.charAt(i)));
        Map<Character, Long> collect = characterStream.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(collect);

    }
}
