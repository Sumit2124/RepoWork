public class PrintProductOfArray
{
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int left_product[]=new int[4];
        int right_product[]=new int[4];
        left_product[0]=1;
        right_product[arr.length-1]=1;
        for(int i=1;i<arr.length;i++)
        {
            left_product[i]=left_product[i-1]*arr[i-1];
        }
        for(int i=arr.length-2;i>=0;i--)
        {
            right_product[i]=right_product[i+1]*arr[i+1];
        }
        for(int i:left_product)
            System.out.print(i+" ");
        System.out.println();
        for(int i:right_product)
            System.out.print(i+" ");
    }
}
