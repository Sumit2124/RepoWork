package dsapracticestart;

public class ProductOfArrayExceptSelf
{
    public static void main(String[] args) {
       int arr[]={10, 3, 5, 6, 2};
       // bruteForce(arr);
        optimal(arr);
    }

    private static void optimal(int[] arr)
    {
        int leftproduct[]=new int[arr.length];
        int rightproduct[]=new int[arr.length];
        int n=arr.length;
        leftproduct[0]=1;
        rightproduct[n-1]=1;
        for(int i=1;i<n;i++)
        {
            leftproduct[i]=arr[i-1]*leftproduct[i-1];
        }
        for(int i=n-2;i>=0;i--)
        {
            rightproduct[i]=rightproduct[i+1]*arr[i+1];
        }
        for(int i:leftproduct)
            System.out.print(i+" ");
        System.out.println();
        for (int i:rightproduct)
            System.out.print(i+" ");
        System.out.println();

    }

    private static void bruteForce(int[] arr)
    {
        int product=1;
        for(int i=0;i<arr.length;i++)
            product*=arr[i];
        for(int i:arr)
                System.out.print(product/i+" ");
        System.out.println();
    }

}
