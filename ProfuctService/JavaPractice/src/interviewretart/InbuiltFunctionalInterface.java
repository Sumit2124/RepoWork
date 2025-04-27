package interviewretart;

import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

class Person {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class InbuiltFunctionalInterface {
    public static void main(String[] args) {
        Predicate<Integer> predicate = a -> a % 2 == 0;
        boolean test = predicate.test(19);
        System.out.println(test);
        Person person = new Person();
        person.setName("Sumit");
        Consumer<Person> consumer = p -> p.setName("Raghav");
        Random random = new Random();
        List<Integer> list = random.ints().limit(10).boxed().toList();
        long sum = list.stream().mapToInt(i -> i).summaryStatistics().getSum();
        long min = list.stream().min(Integer::compareTo).get();
        System.out.println(min);
        Stream.of(1, 1, 3, 2, 4, 3)
                .peek(i -> System.out.println("Value is i"))
                .limit(3)
                .distinct()
                .forEach(System.out::print);


    }
}
