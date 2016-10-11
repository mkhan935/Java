import java.io.*;
import java.util.*;
/*
  This program should give the highest sum within an array in a hourglass
  pattern, like this.
    assume the sample input is
1 1 1 0 0 0
0 1 0 0 0 0
1 1 1 0 0 0
0 0 2 4 4 0
0 0 0 2 0 0
0 0 1 2 4 0

the program is looking at subArrays in hourglass pattern, so like this,
1 1 1   1 1 0   1 0 0   0 0 0
1       0       0       0
1 1 1   1 1 0   1 0 0   0 0 0 etc.

and should give the value of the highest sum it can calculate.

*/

public class twoDemArray
{
    public static void main(String[] args)
    {
      int a[][] = new int[6][6]; //This could be anything, but for the purpose
        //of learning i kept at as INT and set it as a 6X6 array.
        int maxSum = Integer.MIN_VALUE;
        try (Scanner scanner = new Scanner(System.in);)
        {
            for(int i = 0; i < 6; i++)
            {
                for(int j = 0; j < 6; j++)
                {
                    a[i][j] = scanner.nextInt();
                    if (i > 1 && j > 1)
                    {
                        int sum =
                            a[i][j]
                            + a[i][j-1]
                            + a[i][j-2]
                            + a[i-1][j-1]
                            + a[i-2][j]
                            + a[i-2][j-1]
                            + a[i-2][j-2];
                        if (sum > maxSum) {maxSum = sum;}
                    }
                }
            }
        }
        System.out.println(maxSum);
    }
}
