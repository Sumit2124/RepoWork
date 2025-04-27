package MethodReference;

import java.util.StringJoiner;
import java.util.function.BiFunction;
import java.util.function.Function;

interface Messageable{
    Message getMessage(String msg);
}
class Message{
    Message(String msg){
        System.out.print(msg);
    }
}
public class ConstructorReference {
    public static void main(String[] args) {
        Messageable hello = Message::new;
        hello.getMessage("Hello");
        StringJoiner st=new StringJoiner(",");
        for(int i=65;i<=90;i++)
        {
            char ch=(char)i;
            st.add(String.valueOf(ch));
        }
        System.out.println(st.toString());
        Function<Integer,Integer>function=i->i*10;
        Integer apply = function.apply(20);
        System.out.println(apply);
        BiFunction<Integer,Integer,Integer>biFunction=(a,b)->a*b;
        Integer apply1 = biFunction.apply(10, 12);
        System.out.println(apply1);

    }
}