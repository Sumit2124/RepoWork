package Sorting;

import java.util.Comparator;

public class IdComparator implements Comparator<Employee>
{
    @Override
    public int compare(Employee o1, Employee o2) {
        return Integer.compare(o2.getId(), o1.getId());
    }
}
