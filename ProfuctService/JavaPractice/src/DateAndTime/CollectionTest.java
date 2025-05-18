package DateAndTime;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CollectionTest
{
    public static void main(String args[])
    {
        List<Integer> list = IntStream.range(1, 11).boxed().collect(Collectors.toList());
        for(Integer i :list)
            System.out.print(i+" ");
    }

}
