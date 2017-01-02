import java.util.Stack;

/**
 * Created by Mohammed M Khan on 1/1/2017.
 */
public class stack {
    public static void main(String[] args) {

        Stack<String> stack = new Stack<String>();
        //push, adds to the top of the stack, whats already in the stack gets pushed down.....get it
        stack.push("Bottom");
        stack.push("Second");
        stack.push("Third");

        int size=stack.size(); //saving the length of the stack in case we decide to expand program


        for(int i=0;i<size;i++){
            printContent(stack);
        }

       printContent(stack);//check to see if stack is empty
    }

    //simple print method to print the pop result of the stack
    public static void printContent(Stack<String> s) {
        if (s.isEmpty()) {
            System.out.println("Stack is empty");
        } else {
            System.out.println(s.pop()); //can use peek if i wanted to just see whats on top

        }
    }
}
