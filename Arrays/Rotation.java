import java.util.Scanner;

public class Rotation {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Rotation. */
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int num = s.nextInt();
        int[] array = new int[size];
        /** instead of using method, how about if we place them in sorted order
         * as they come in? */
        for(int i=0; i<size;i++) {
            array[(i+size-num)%size] = s.nextInt();
            //so [1,2,3,4,5] size=5 num = 2
            /** i=0 + 5 - 2 =3 % 5 =3 so the number we put at pos[0]
             * is actually being put in pos[3], can a collision occur?
             * its almost 2am */
        }
            //array for test is [1,2,3,4,5], if i rotate twice
            //first r - [2,3,4,5,1] second r - [3,4,5,1,2]

        for(int i=0; i<array.length;i++) {
            System.out.print(array[i]);

        }

    }


        //can i make it better? hmmm
    public static int [] leftRotate(int[] arrayToRotate,int numOfTimes){
        int lengthOfArray = arrayToRotate.length;
        int [ ] temp = new int[lengthOfArray];
        for(int i=0;i<numOfTimes;i++){
            for(int j=0;j<lengthOfArray;j++){
                int pos = j - numOfTimes;
                if (pos<0){
                    pos = -1 * pos; //pos = 1
                    pos = lengthOfArray - pos;
                    temp[pos] = arrayToRotate[j];

                }
                else{
                    temp[pos]=arrayToRotate[j];
                }

            }
        }
        return temp;

    }
}