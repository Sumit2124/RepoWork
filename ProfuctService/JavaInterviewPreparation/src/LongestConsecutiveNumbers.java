public class LongestConsecutiveNumbers
{
    public static void main(String[] args) {
        int[] arr = { 4, 3, 25, 6, 7, 8, 9, 2, 3, 10 };
        int count=1;
        int countMax=0;
        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i]+1==arr[i+1])
            {
                count++;
                countMax=Math.max(countMax,count);
            }
            else
                count=1;

        }
        System.out.println(countMax);
    }
}
