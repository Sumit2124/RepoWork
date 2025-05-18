package Sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CheckerClass
{
    public static void main(String[] args) {
        Employee employee1=new Employee("Sumit",1);
        Employee employee2=new Employee("Yakshi",2);
        List<Employee>employees=new ArrayList<>(List.of(employee1,employee2));
        Collections.sort(employees,new IdComparator());
        System.out.println(employees);
    }
}
