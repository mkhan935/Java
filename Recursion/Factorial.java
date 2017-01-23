/**
 * Let's practice recursion, created this class to handle
 * the computation
 * this program is probably the first one we are taught in intro to programming
 */
public class Factorial
{
    public int factorial(int num)
    {
        if(num == 0)
        {
         return 1;   //this if part checks base case
        }
        else
        {
         return num*factorial(num-1);      //recursive call on the else if base case is not met


        }
    }

}
