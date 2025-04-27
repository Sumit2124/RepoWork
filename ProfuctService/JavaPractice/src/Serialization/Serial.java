package Serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Serial
{
    public static void main(String[] args) throws IOException {
//        Student student=new Student("Sumit","sumit@gmail.com","DDN",24);
//        FileOutputStream fos=new FileOutputStream("ob.txt");
//        ObjectOutputStream oos=new ObjectOutputStream(fos);
//        oos.writeObject(student);
//
        Stream<Integer> boxed = IntStream.range(1, 11).boxed();
        double average = boxed.mapToInt(i -> i).summaryStatistics().getAverage();

    }
}
