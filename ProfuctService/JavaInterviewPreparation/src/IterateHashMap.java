import java.util.*;

public class IterateHashMap
{
    public static void main(String[] args) {
        HashMap<String, String> hash_map = new HashMap<>();
        hash_map.put("India", "New Delhi");
        hash_map.put("France", "Paris");
        hash_map.put("Germany", "Berlin");
        hash_map.put("Australia", "Canberra");
        Set<Map.Entry<String, String>> entries = hash_map.entrySet();
        for(Map.Entry<String,String>entry:entries)
        {
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
       ArrayList<String>list=new ArrayList<>(hash_map.values());

    }


}
