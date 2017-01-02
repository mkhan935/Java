import java.util.Scanner;
import java.util.Stack;

/**
 * Created by Mohammed M Khan on 1/1/2017.
 */
public class stacksAgain
{
    //the point of this exercise is to be able to get the maxValue in the stack.
    public static void main(String[] args)
    {
        int choice=0;  //user choice
        int currentMAX=0; // these two max variables will be used to track the max during push/pop
        int oldMAX=0;
        Stack<Integer>stack=new Stack<>(); //stack

        while(choice!=4)
        {
            System.out.println("enter option: 1,2,3,4(exit)");
            Scanner s = new Scanner(System.in);

            choice=s.nextInt();

            if(choice==1)
            {   //if choice = 1, ask for a num to push into the stack.
                System.out.println("Enter num to push");
                int num=s.nextInt();

                if(num>currentMAX)
                {         //if the num is > than the currentMax then set the oldMAX to the currentMax
                    oldMAX=currentMAX;      //and set currentMax to num
                    currentMAX=num;
                }

                stack.push(num);
            }

            if(choice==2)
            {//if choice = 2, pop the stack, currentMAX = the oldMax
                if (!stack.isEmpty())
                {         //make sure the stack is not empty.
                    int delete = stack.pop();
                    if (delete == currentMAX)
                    {
                        currentMAX = oldMAX;
                    }

                } else
                    System.out.println("Stack is empty.");
            }

            if (choice==3)
            { //if choice is 3, get the currentMAX in the stack
                System.out.println(currentMAX);
                System.out.println(stack);//print entire stack just to make sure
            }

            if (choice==4)
            {
                return; //exit
            }
        }
    }
}

