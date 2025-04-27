package dsapracticestart;

import java.util.Arrays;

public class RemoveDuplicates
{
    public static void main(String[] args) {
        int[] arr = { 3, 2, 1, 1, 2, 2, 3, 2, 1, 3,5,6,7 };
        Arrays.sort(arr);
        int i=0,j=0;
        for(i=1;i< arr.length;i++)
        {
            if(arr[j]!=arr[i])
            {
                j++;
                arr[j]=arr[i];
            }

        }
        System.out.println(j+1);
    }
}
