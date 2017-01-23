/**
 * Main class, basically call the Factorial class, create obj, and run the method
 */
public class runFactorial {
    public static void main(String[] args)
    {
        Factorial recursion = new Factorial(); //create obj

        System.out.println(recursion.factorial(10)); //print the results.
        //3628800
        //lets check something we can verify without a calc

        System.out.println(recursion.factorial(3)); //  3*2*1 = 6
        System.out.println(recursion.factorial(0)); // 0!=1
        System.out.println(recursion.factorial(5));// 5*4*3*2*1 = 120
    }
}
