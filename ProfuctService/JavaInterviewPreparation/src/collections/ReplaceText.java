package collections;

import java.util.ArrayList;

public class ReplaceText {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Test1");
        list.add("Test1");
        list.add("Test2");
        list.add("Test3");
        list.add("Test4");
        int index = list.indexOf("Test2");
        list.set(index,"New Text");
        System.out.println(list);
    }
}
