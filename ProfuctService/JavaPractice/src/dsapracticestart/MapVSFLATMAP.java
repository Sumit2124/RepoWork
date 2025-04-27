package dsapracticestart;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MapVSFLATMAP
{
    public static void main(String[] args) {
        List<String> fruits=new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Pineapple");
        List<Integer> size = fruits.stream().map(
                i -> i.length()
        ).collect(Collectors.toList());
        System.out.println(fruits);
        System.out.println(size);

        List<List<Integer> > number = new ArrayList<>();

        // adding the elements to number arraylist
        number.add(Arrays.asList(1, 2));
        number.add(Arrays.asList(3, 4));
        number.add(Arrays.asList(5, 6));
        number.add(Arrays.asList(7, 8));
        List<Integer> list = number.stream().flatMap(i ->
                i.stream()).collect(Collectors.toList());
        int arr[]={1,2,3,4,5};
        List<Integer> integerStream = IntStream.range(0, arr.length).mapToObj(i -> arr[i]).collect(Collectors.toList());
        Integer reduce = integerStream.stream().reduce(0, (a, b) -> a + b);

        int min = integerStream.stream().mapToInt(i -> i).min().getAsInt();
        int max= integerStream.stream().mapToInt(i -> i).max().getAsInt();
        System.out.println(min+"  "+max);
    }
}
