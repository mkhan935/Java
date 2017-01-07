/**
 * Created by Mohammed M Khan on 1/7/2017.
 */
public class Generic {
    public static void main(String[] args) {
        Integer[] simpleArray={1,2,3,4};
        Character[] SimpleCArray={'M','O','H','A','M','M','E','D'};

        //So the point of this excercise is to go over generic methods
        //lets say i want to print the array, lets create a method that will not
        //care what type is passed


        printThis(simpleArray);

        System.out.println(); // blank line

        printThis(SimpleCArray);
    }

    private static <T> void printThis(T[] arrayPassedIn){  //generic type void, pass in any type of Array
        for(T itemIn:arrayPassedIn ){ // for any primitive type of itemIn in the array that is passed into the method
            System.out.println(itemIn); //print it out
        }
    }
}
