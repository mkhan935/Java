/**
 * Ok, lets review LinearSearch Today, Hopefully I'm able to do it for both python and Java at once.
 * Taking 6 classes, bear with me
 */
public class LinearSearch {
    /** This is the search method
     * takes 3 param, an Integer type Array, the length of this Array, and the value you are looking for
     * which in all the years of math has been x
     * worst case runtime O(n)
     * best case runtime O(1)
     * in short, linear search is sort of horrible if searching a huge database*/
    public static int search(int theArray[], int lengthOfArray, int x)
    {
        for(int i=0; i<lengthOfArray; i++)
        {
            if(theArray[i] == x)         //if the current index holds value x return this index
                return i;
        }

        return -1;  // after going thru entire array and not finding x return -1
    }

    public static void main(String[] args) {
        int test[] = new int[10]; //creating an array of size 10

        for (int i=0; i<test.length; i++)
        {
            test[i]=i; //giving it values from 0-9
        }
        System.out.println("This is what is in the array at position 4: "+ test[4]);
        System.out.println("This is what the linear Search function returned: "+ search(test,test.length,4));

    }
}
