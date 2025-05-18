package Java8;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class NthHighestSalaryDemo
{
    public static void main(String[] args) {
        Map<String,Integer> map=new HashMap<>();
        map.put("anil",1000);
        map.put("bhavna",1300);
        map.put("micael",1500);
        map.put("tom",1600);
        map.put("ankit",1200);
        map.put("daniel",1700);
        map.put("james",1400);
        bruteForce(map,1);
        Map<String,Integer> map2=new HashMap<>();
        map2.put("anil",1000);
        map2.put("ankit",1200);
        map2.put("bhavna",1200);
        map2.put("james",1200);
        map2.put("micael",1000);
        map2.put("tom",1300);
        map2.put("daniel",1300);
        optimal(map2,2);
    }
    public static void bruteForce(Map<String,Integer>hashmap,int num)
    {
        Map.Entry<String, Integer> stringIntegerEntry = hashmap.entrySet().stream().sorted(Collections.reverseOrder(Map.Entry.comparingByValue())).collect(Collectors.toList()).get(num - 1);
        System.out.println(stringIntegerEntry);
    }
    public static void optimal(Map<String,Integer>hashmap,int num)
    {
        Map.Entry<Integer, List<String>> integerListEntry = hashmap.entrySet().stream().collect(Collectors.groupingBy(Map.Entry::getValue,
                Collectors.mapping(Map.Entry::getKey, Collectors.toList()))).entrySet().stream().sorted(Collections.reverseOrder(Map.Entry.comparingByKey())).collect(Collectors.toList()).get(num - 1);
        System.out.println(integerListEntry);
    }
}
