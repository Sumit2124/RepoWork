package DateAndTime;

public class MergeTwoSortedArrays
{
    public static void main(String[] args) {
        int[] arrayA = new int[] {1, 2, 3, 4, 5};
        int[] arrayB = new int[] {6, 7, 8, 9, 10};
        int c[]=new int[arrayB.length+arrayA.length];
        int i=0,j=0,k=0;
        while(i<arrayA.length&&j<arrayB.length)
        {
            if(arrayA[i]<arrayB[j])
            {
                c[k++]=arrayA[i++];
            }
            else {
                c[k++]=arrayB[k++];
            }
        }
        while(i<arrayA.length)
        {
            c[k++]=arrayA[i++];
        }
        while(j<arrayA.length)
        {
            c[k++]=arrayB[j++];
        }
        for( i=0;i<c.length;i++)
        {
            System.out.print(c[i]+" ");
        }
    }
}
