package com.mo;

import java.util.*;

/**
 * Created by Mohammed M Khan on 1/11/2017.
 *
 * As I said, I'm going over data structures and Alg, in prep for the real world
 * I did not want to just code a simple HashMap....thats boring, I wanted to have fun
 * so I made this atm/bank kind of program
 *
 * its not foolproof
 * the errors are, if two people create the same password? what then? or they have the same userName?
 * once the program finishes the data in hashmap is gone....solution is to export to file and read from file
 * these are easy fixes, i Just wanted to review hashMaps and have fun, hopefully my comments help whoever is looking at
 * my code, follow along
 */
public class HashExample {



    public static void main(String[] args) {
        HashMap(); /** calling the program */

    }



    public static void HashMap(){
        Map<String,Object> db=new HashMap<>(); /**I wanted to create a String String hashmap but thats too simple,
         So I created an String object map, the idea is the each Password
         maps to an Object. */

        String basicAnswers;                 /**Using this string to store userInput to my questions  */

        String UserName;
        String Password;
        double balance;                    /**This is all self explanatory,  */
        double deposit;


        User user;
        String test;
        String testPass;

        Scanner in = new Scanner(System.in);


        /** This is where my program "starts",
         * ask User for input, as long as that input is not an E meaning Exit, keep running
         * */

        System.out.println("Login or Register? L or R or E");
        basicAnswers = in.next();
        while (!basicAnswers.equalsIgnoreCase("e"))
        {

            /** if the user gives an R, we register him/her  */
            if(basicAnswers.equalsIgnoreCase("r"))
            {

                System.out.println("Enter username");
                UserName = in.next();
                System.out.println("Enter Password");
                Password = in.next();
                System.out.println("Initial dep?");
                balance=in.nextDouble();


                user = new User(UserName, Password,balance); /** Call my user class constructor and create a user Object with user input parameters
             in a real world scenario exception handling should be done here

             things like username length, characters that should be allowed,
             password length, legal password characters,
             max amount an intial deposit be, called it balance here...etc.

             once again, I just wanted to have fun coding and reviewing at the same time!!*/

                db.put(user.getPassword(), user); /** this is where the password and Obj(user) are put into the db, db=database=hashmap=sql server etc.
             a place that holds my data*/


                System.out.println("You are now registered");
                System.out.println("Login or Register? L or R or E");
                basicAnswers=in.next();
            }

               /*
                   user=new User("userName","password","balance");
                   user2=new User("userName2","password2","balance2");

                   db.put("password",user)
                   hash.put("C", c2);

            User getObj = (User)hash.get("password");
            Test getObj2 = (User)hash.get("password2"); */


            /** Now when a user tries to LogIn, i check if the db is empty, if it is, output the msgs and ask them to register
             * then if the db does contain the password as key, I access that user obj that was created and GET the corresponding value
             * for that password key.*/

            if(basicAnswers.equalsIgnoreCase("L"))
            {
                System.out.println("Enter login userName");
                test=in.next();
                System.out.println("Enter login Pass");
                testPass=in.next();
                if(db.isEmpty())
                {
                    System.out.println("No ENTRY FOR GIVEN USER, Please Register");
                    System.out.println("Login or Register? L or R or E");
                    basicAnswers=in.next();
                }



                else if(db.containsKey(testPass))
                {
                    User AccessUserObJ=(User) db.get(testPass);
                    if(test.equalsIgnoreCase(AccessUserObJ.getUserName()))     /**  check if test(user input username) = the user.username that
                     was created when they registered*/
                    {
                        System.out.println("Welcome, your current Balance is: "+"$"+AccessUserObJ.getBalance());
                        System.out.println("Do you want to deposit funds? Y/N");
                        String userInput=in.next(); //used this for the yes or no inputs
                        if(userInput.equalsIgnoreCase("y"))
                        {
                            System.out.println("How much?");
                            deposit=in.nextDouble();
                            double currentBalance=AccessUserObJ.getBalance();
                            AccessUserObJ.Deposit(deposit);
                            /** allowed user to input money, just for fun  */
                            System.out.println("Your old Balance is:$"+currentBalance+"\nYour new  balance is:$"+AccessUserObJ.getBalance());
                            System.out.println("Transaction complete....logging out");
                            System.out.println("Login or Register? L or R or E");
                            basicAnswers=in.next();


                        }
                        if(userInput.equalsIgnoreCase("n"))
                        {
                            System.out.println("Ok");
                        }



                    }
                    else
                    {
                        System.out.println("Invalid UserName");   /** if the userName is wrong, output msg */

                    }

                }

                else
                {
                    System.out.println("Invalid Password");
                    System.out.println("Login or Register? L or R or E");
                    basicAnswers=in.next();
                }


            }

            if(basicAnswers.equalsIgnoreCase("e"))
            {
                /** break while loop if user enters e, output msg */
                System.out.println("Logging Out");
            }

        }
    }
}
