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

    public int binarySearchRecursive(int arr[], int left, int right, int x)
    {
        if(right>=left)
        {
            int middle = left + ( right - left)/2;

            if(arr[middle] == x)
                return middle;

            if(arr[middle]>x)
                return binarySearchRecursive(arr,left,middle-1,x);


            return binarySearchRecursive(arr,middle+1,right,x);
        }

        return -1; //not in array
    }

    /** reviewed this today
     * I sort of like recursion more but this is def easier to write
     * also recursion is much more expensive
     * one while loop, the concept inside the loop is the same */

    public  int binarySearchIterative(int arr[],int x)
    {
        int left =0, right = arr.length -1;
        while (left<=right)
        {
            int middle = left +(right-left)/2;
            if (arr[middle]==x)
                return middle;
            if(arr[middle] < x)
                left = middle + 1;
            else
                right = middle - 1;
        }
        return -1;
    }

    /**
     * the only thing that needs explaining here is why left is 0 initially and why right is n-1
     * first, right is n-1 signifying the last position in the array
     * second, left is 0, because initially the value could be anywhere from position 0 to the
     * last position in the array.*/

    public static void main(String[] args) {


        BinarySearch test = new BinarySearch();

        int testArr[] = {22,44,65,110,230};

        int n =testArr.length;

        int x = 44;//for Iterative test
        int y = 110; //for recursion test
        int iterativeResult =test.binarySearchIterative(testArr, x);
        int result = test.binarySearchRecursive(testArr,0,n-1,y);
        if (result == -1 )
        {
            System.out.println("Element is not in testArr");
        }
        if ( iterativeResult == -1)
        {
            System.out.println("Element is not in testArr");
        }
        else
        {
            System.out.println("Using Recursion: Element found at position: " + result);
            System.out.println("Using Iterative: Element found at position: " + iterativeResult);
        }

    }
}
