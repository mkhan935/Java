import java.util.Random;

/**
 * Created by Mohammed Khan on 10/10/2016.
 */
public class simpleArray {

    public static void main(String[] args){
        int[] x= new int[10];
        Random num=new Random();
        for(int i=0;i<x.length;i++){

            x[i] = num.nextInt();

            System.out.println(x[i]);
        }
    }
}
