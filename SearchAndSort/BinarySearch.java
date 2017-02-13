/**
 * Created by Mohammed M Khan on 2/12/2017.
 */
public class BinarySearch {

    public int binarySearch(int arr[], int left, int right, int x)
    {
        if(right>=left)
        {
            int middle = left + ( right - left)/2;

            if(arr[middle] == x)
                return middle;

            if(arr[middle]>x)
                return binarySearch(arr,left,middle-1,x);


            return binarySearch(arr,middle+1,right,x);
        }

        return -1; //not in array
    }

    public static void main(String[] args) {
        BinarySearch test = new BinarySearch();

        int testArr[] = {2,3,4,10,40};

        int n =testArr.length;

        int x = 10;

        int result = test.binarySearch(testArr,0,n-1,x);
        if (result == -1)
        {
            System.out.println("Element is not in testArr");
        }
        else
        {
            System.out.println("Element found at position: " + result);
        }
    }
}
