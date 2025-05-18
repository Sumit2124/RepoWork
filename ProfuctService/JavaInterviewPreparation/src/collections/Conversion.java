package collections;

import java.util.ArrayList;
import java.util.List;

public class Conversion
{
    public static void main(String[] args) {
        String[] stringArray = { "One", "Two", "Three", "Four" };
        List<String> list=new ArrayList<>(List.of(stringArray));
        System.out.println(list);
    }
}
