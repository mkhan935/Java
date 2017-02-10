/**
 * Ok, lets review LinearSearch Today, Hopefully I'm able to do it for both python and Java at once.
 * Taking 6 classes, bear with me
 */
public class LinearSearch {

    public static int search(int theArray[], int n, int x)
    {
        for(int i=0; i<n; i++)
        {
            if(theArray[i] == x)
                return i;
        }

        return -1;
    }

    public static void main(String[] args) {
        int test[] = new int[10];

        for (int i=0; i<test.length; i++)
        {
            test[i]=i;
        }

        System.out.println(search(test,test.length,4));
        System.out.println(test[4]);
    }
}
