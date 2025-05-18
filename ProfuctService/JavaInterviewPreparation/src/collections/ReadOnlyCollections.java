package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ReadOnlyCollections
{
    public static void main(String[] args) {
        List<Integer> list = IntStream.range(1, 11).boxed().collect(Collectors.toList());
        List<Integer> integers = Collections.unmodifiableList(list);
        integers.add(1);
        String arr[]={"a","b"};
        List<String>list1=new ArrayList<>(List.of(arr));
        

    }
}
