package collections;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class LowestHighest {
    public static void main(String[] args) {
        List<Integer> list = IntStream.range(1, 11).boxed().collect(Collectors.toList());
        Integer min = list.stream().min(Integer::compareTo).get();
        Integer max = list.stream().max(Integer::compareTo).get();
        System.out.println(min+" "+max);

    }
}
