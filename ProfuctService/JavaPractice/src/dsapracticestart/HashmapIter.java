package dsapracticestart;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashmapIter
{
    public static void main(String[] args) {
        HashMap<String, String> hash_map = new HashMap<>();

        hash_map.put("India", "New Delhi");
        hash_map.put("France", "Paris");
        hash_map.put("Germany", "Berlin");
        hash_map.put("Australia", "Canberra");
        for(Map.Entry<String,String>map:hash_map.entrySet())
        {
            System.out.println(map.getKey()+" "+map.getValue());
        }
        Iterator<String> iterator = hash_map.keySet().iterator();
        while(iterator.hasNext())
        {
            String key = iterator.next();
            String value=hash_map.get(key);
            System.out.println(key+"  "+value);
        }

    }
}
