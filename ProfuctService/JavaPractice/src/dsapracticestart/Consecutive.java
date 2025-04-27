package dsapracticestart;

public class Consecutive
{
    public static void main(String[] args) {
        int[] arr = { 4, 3, 25, 6, 7, 8, 9, 2, 3, 10 };
        int count=1;
        int maxCount=0;
        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i+1]==arr[i]+1)
            {
                count++;
            }
            else
                count=1;
            maxCount=Math.max(count,maxCount);
        }
        System.out.println(maxCount);
    }
}
