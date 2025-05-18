package DateAndTime;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CollectionClassTestMain {
    public static void main(String[] args) {
        List<Integer> list = IntStream.range(1, 101).boxed().collect(Collectors.toList());
        List<Integer> even = list.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
        even.forEach(i-> System.out.println(i));

    }
}
