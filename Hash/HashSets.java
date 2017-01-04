import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by Mohammed M Khan on 1/4/2017.
 */
public class HashSets {

    //this is just a simple hashset review, i will go into more advanced stuff soon.
    public static void main(String[] args) {
        String[] items={"Apples", "Diapers","Batteries","cheesecake","Apples"};
        List<String> listOfItems= Arrays.asList(items);

        System.out.println(listOfItems); //just print out the list
        System.out.println();//print blank line

        Set<String> set=new HashSet<String>(listOfItems);

        //should have deleted duplicates, in my example, apples should be gone

        System.out.println(set);
        System.out.println();//Blank Line

        System.out.println(set.contains("Diapers")); //contains is a bool, in this example it should output true
        System.out.println();//blank line

        set.add("Oranges");
        set.add("IceCream");
        System.out.println(set);//add these two objects to the set


        set.clear();
        System.out.println(set);//clear set of all values


    }
}
