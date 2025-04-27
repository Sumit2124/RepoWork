package MethodReference;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class MapTest
{
    public static Map<Integer,String> returnMap()
    {
        Map<Integer,String>map=new HashMap<>();
        map.put(4,"Yakshi");
        map.put(3,"Sumit");
        map.put(1,"Raghav");
        map.put(5,"Aman");
        map.put(7,"Anuj");
        map.put(6,"Tathagat");
        map.put(8,"Gehna");
        return map;
    }

    public static void main(String[] args)
    {
//    sortMap(returnMap());
//        Options();
        optionals();
    }

    private static void sortMap(Map<Integer, String> integerStringMap)
    {
        LinkedHashMap<Integer, String> collect = integerStringMap.entrySet().stream().sorted(Map.Entry.comparingByKey()).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
        System.out.println(collect);
    }
    private static void Options()
    {
        Optional<Integer>optional=Optional.of(20);
        if(optional.isEmpty())
        {
            System.out.println("Not Present");
        }
        else
        {
            System.out.println("Present");
        }

    }
    public static  void optionals()
    {
        // creating a string array
        String[] str = new String[5];

        // Setting value for 2nd index
        str[2] = "Geeks Classes are coming soon";

        // It returns an empty instance of Optional class
        Optional<String> empty = Optional.empty();
        System.out.println(empty);

        // It returns a non-empty Optional
        Optional<String> value = Optional.of(str[2]);
        System.out.println(value);
    }
}
