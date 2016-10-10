import java.util.Random;

/**
 * Created by Mohammed Khan on 10/10/2016.
 */
public class simpleArray {

  //this is just a simple Array of size 10.

    public static void main(String[] args){
        int[] simpleArray= new int[10];
        Random num=new Random();
        for(int i=0;i<simpleArray.length;i++){
//created a random num gen, which using the for loop will fill the array
            simpleArray[i] = num.nextInt();

            System.out.println(simpleArray[i]); //prints on new line each time to console.
        }
    }
}
