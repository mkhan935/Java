/**
 * Time to review BinarySearch
 *
 * ok, for now lets go over the recursive method
 *
 * the method takes an array, the left position, the right position, and the value we are looking for x
 *
 * if the right position is >= to the left position then we create a middle.
 * middle = left position + (right(high) - left(low))/2 creating a midpoint.
 *
 * if value in position middle == x return position middle
 * if value of middle is > x, means x is between left and middle so we can make another middle by recursively calling the method
 * if its none of that, then x is between middle and right, so recursively call that using method
 *
 * if it doesnt exist in the array, return -1
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

         /**
          * the only thing that needs explaining here is why left is 0 initially and why right is n-1
          * first, right is n-1 signifying the last position in the array
          * second, left is 0, because initially the value could be anywhere from position 0 to the
          * last position in the array.*/
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
