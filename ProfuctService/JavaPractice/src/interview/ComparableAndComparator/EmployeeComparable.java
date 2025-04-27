package interview.ComparableAndComparator;

import java.util.ArrayList;
import java.util.Collections;

public class EmployeeComparable
{
    public static void main(String[] args)
    {
        ArrayList<Employee> list = new ArrayList<Employee>();

        list.add(new Employee("Rahul",6589586,35));

        list.add(new Employee("John",854756,3));

        list.add(new Employee("Robin",784125,32));
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
    }
}
