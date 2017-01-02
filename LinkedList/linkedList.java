import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/**
 * Created by Mohammed M Khan on 1/1/2017.
 */
public class linkedList {
    public static void main(String[] args) {
        String[] Fruits={"Apples","Oranges","Melons"};
        List<String> list1= new LinkedList<>();
        for(String fruit:Fruits){
            list1.add(fruit);
        }

        String[] meats={"Goats","beef","Chicken"};
        List<String>list2=new LinkedList<>();
        for(String thingsin:meats){
            list2.add(thingsin);
        }

        list1.addAll(list2);
        list2=null;


        printMe(list1);
        System.out.println();
        remove(list1,2,4);
        printMe(list1);
        System.out.println();
        reverseList(list1);





    }



        //this method takes a list as param, then uses enhanced for loop to loop thru list and print each item in the list
    private static void printMe(List<String> list){
        for (String thingsin:list){
            System.out.println(thingsin);
        }
    }


    private static void remove(List<String> list, int from, int to){
        list.subList(from,to).clear(); //takes list and creates a sub list of index from-to, and clear it.
    }

    //takes a list, create a iterator that loops backward, while it has an item before it, print.
    private static void reverseList(List<String> list){
        ListIterator<String> counter =list.listIterator(list.size());
        while (counter.hasPrevious()){
            System.out.println(counter.previous());
        }
    }



}
