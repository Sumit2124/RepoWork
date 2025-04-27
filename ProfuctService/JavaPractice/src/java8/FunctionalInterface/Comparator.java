package java8.FunctionalInterface;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Comparator
{
    public static void main(String[] args)
    {
        String names[]={"Praful","Vrishank","Aditya","Shubham","Yash","Satyam"};
        Stream<String> stream = IntStream.range(0, names.length).mapToObj(i -> names[i]);
        Arrays.sort(names,(s1,s2)->s1.compareTo(s2));
        List<String> sortedList = stream.sorted((s1, s2) -> s1.compareTo(s2)).toList();
        for(String n:names)
            System.out.println(n);
        System.out.println(sortedList);
    }
}
