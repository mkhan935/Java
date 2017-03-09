/**
 * Bubble Sort Review
 */
public class BubbleSort {

    public void bubbleSort(int arr[])
    {
        int n = arr.length;
        for(int i=0;i<n-1;i++)
            for(int j = 0; j<n-i-1; j++)
                if(arr[j]>arr[j+1])
                {
                    //swap
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]= temp;
                }
    }

    public void  printArray(int a[])
    {
        int n=a.length;
        for (int i=0;i<n;i++)
        {
            System.out.println(a[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        BubbleSort bs = new BubbleSort();
        int testA[]={46,23,55,86,92,15,5};
        bs.bubbleSort(testA);
        System.out.println("The Sorted array looks like: "); //sout
        bs.printArray(testA);
    }
}
