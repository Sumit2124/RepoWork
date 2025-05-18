package DateAndTime;


import ThreadProducerConsumer.Producer;

import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionalInterTest {
    public static void main(String[] args) {


        //Consumer
        Consumer<Integer> consumer = i-> System.out.println("Value is "+i*2);

        //Predicate
        Predicate<Integer>predicate=i->
        {
          if(i%2!=0)
              return true;
          return false;
        };
        System.out.println("Testing whether 5 is odd or even "+predicate.test(5));

        //Supplier

        Supplier<Double>supplier=()->new Random().nextDouble();

        //Function

        Function<Integer,Boolean> testOdd=i->predicate.test(i);
        System.out.println("Value is "+testOdd);

    }
}
