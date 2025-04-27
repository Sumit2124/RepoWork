package dsapracticestart;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Start
{
    public static void main(String[] args)
    {
     //printEvenNumbersOnly();
     //findOutDuplicates();
     //findFirstElement();
     // findTotal();
//        findNonRepeatingCharacter();
//        findCountOfEachNumberInList();
//        sortNumbersPrintThem();
        ifAnyNumberAppearsTwice();
    }
    public static void printEvenNumbersOnly()
    {
        List<Integer> list= Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        List<Integer> collect = list.stream().filter(i -> i % 2 == 0).toList();
        System.out.println("Even elements:"+collect);
    }
    /*
    Given a list of integers, find out all the numbers starting with 1 using Stream functions
     */
    public static void findOutAllNumbersStartingWith1()
    {
        List<Integer> list = Arrays.asList(1, 12, 2, 4, 5, 6, 7, 8, 13, 15, 71, 18, 19, 1111, 11111, 1230, 232, 3423, 53);
        List<String> collect = list.stream().map(s -> s + "").toList();
        List<String> strings = collect.stream().filter(s -> s.startsWith("1")).toList();
        List<Integer> finalAnswer = strings.stream().map(Integer::parseInt).collect(Collectors.toList());
        System.out.println(finalAnswer);
    }
    /*
    How to find duplicate elements in a given integers list in java using Stream functions?
     */
    public static void findOutDuplicates()
    {
        //Impo
        List<Integer> list = IntStream.range(1, 11).boxed().collect(Collectors.toList());
        for(int i=7;i<=10;i++)
        {
            list.add(i);
        }
        List<Integer> duplicates = list.stream().filter(i -> Collections.frequency(list, i) > 1).distinct().toList();
        System.out.println(duplicates);

    }
    /*
    Given the list of integers, find the first element of the list using Stream functions
     */
    public static void findFirstElement()
    {
        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        integers.stream().findFirst().ifPresent(System.out::println);
    }
    /*
    Given a list of integers, find the total number of elements present in the list using Stream functions
     */
    public static void findTotal()
    {
        List<Integer> list = IntStream.range(1, 101).boxed().collect(Collectors.toList());
        long count = list.stream().count();
        System.out.println(count);

    }
    /*
    Given a list of integers, find the maximum value element present in it using Stream functions
     */
    public static void findMaxMin()
    {
        List<Integer> list = IntStream.range(1, 1001).boxed().toList();
        Integer min = list.stream().min(Integer::compareTo).get();
        Integer max=list.stream().max(Integer::compareTo).get();

    }
    /*
    Given a String, find the first non-repeated character in it using Stream functions
     */
    public static void findNonRepeatingCharacter()
    {
        String str="Java is awesome";
        Stream<Character> characterStream = IntStream.range(0, str.length()).mapToObj(i -> str.charAt(i));
        LinkedHashMap<Character, Long> collect = characterStream.collect(Collectors.groupingBy(x->x, LinkedHashMap::new, Collectors.counting()));
        System.out.println(collect);
        for (Map.Entry<Character,Long>map: collect.entrySet())
        {
           if(map.getValue()==1)
            {
                System.out.println(map.getKey());
                break;
            }

        }
    }
    public static void findCountOfEachNumberInList()
    {
        List<Integer> list = IntStream.range(1, 1001).boxed().collect(Collectors.toList());
        for(int i=10;i<=20;i++)
        {
            list.add(i);

        }
        for(int i=40;i<=200;i++)
        {
            list.add(i);
            list.add(i);
        }
        for(int i=400;i<=500;i++)
        {
            list.add(i);
            list.add(i);
            list.add(i);
        }
        LinkedHashMap<Integer, Integer> collect = list.stream().collect(Collectors.toMap(i -> i, i ->1,Integer::sum, LinkedHashMap::new));
        System.out.println(collect);

    }
    /*
    Given a list of integers, sort all the values present in it using Stream functions?
     */
    public static void sortNumbersPrintThem()
    {
        List<Integer> integers = Arrays.asList(1, 3, 2, 9, 10, 2, 4, 5, 6, 7, 8);
        integers.stream().sorted().forEach(System.out::print);
    }
    /*
    Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
     */
    public static void ifAnyNumberAppearsTwice()
    {
        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 2,3,1);
        Optional<Integer> first = integers.stream().filter(i -> Collections.frequency(integers, i) > 1).findFirst();
        if(first.isEmpty())
            System.out.println("Not found");
        else
            System.out.println("Found "+first.get());

    }
    




}
