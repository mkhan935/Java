/**
 * Created by Mohammed M Khan on 3/6/2017.
 */
public class InsertionSort
{
    public static void sortThis(int sort[])
    {
        int n = sort.length;
        for(int i=1; i<n; i++)
        {
            int key = sort[i];
            int j = i-1;


            while (j>=0 && sort[j]>key)
            {
                sort[j+1] = sort[j];
                j=j-1;
            }
            sort[j+1] = key;
        }
    }


    public static void printThis(int sort[])
    {
        int n= sort.length;
        for(int i=0; i<n; i++)
        {
            System.out.println(sort[i] + " ");

        }
        System.out.println();
    }

    public static void main(String[] args) {
        int test[]={10,16,43,23,11};
        InsertionSort objectTest = new  InsertionSort();
        objectTest.sortThis(test);
        printThis(test);
    }

}
